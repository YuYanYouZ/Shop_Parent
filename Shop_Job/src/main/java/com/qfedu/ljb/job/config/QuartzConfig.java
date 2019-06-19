package com.qfedu.ljb.job.config;

import com.qfedu.ljb.job.job.StudyJob;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {
    /**
     * 1、创建调度器--默认单例
     * @return
     * @throws SchedulerException
     */
    @Bean(name = "scheduler")
    public Scheduler createS() throws SchedulerException {
        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        scheduler.start();
        return scheduler;
    }

    /**
     * 作业
     * @param scheduler
     * @return
     * @throws SchedulerException
     */
    @Bean
    public JobDetail createJob(Scheduler scheduler) throws SchedulerException{
        JobDetail jobDetail= JobBuilder.newJob(StudyJob.class).storeDurably(false).build();
        CronTrigger trigger = TriggerBuilder.newTrigger().withSchedule(CronScheduleBuilder.cronSchedule("0/2 * * 18 * ?")).build();
        scheduler.scheduleJob(jobDetail, trigger);
        return jobDetail;
    }




}
