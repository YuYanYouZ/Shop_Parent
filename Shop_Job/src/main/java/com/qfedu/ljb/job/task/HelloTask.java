package com.qfedu.ljb.job.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class HelloTask {
    //每天下午的2：30和3：30之后每隔3秒
    @Scheduled(cron = "0/3 30/1 21,22 * * ?")
    public void  task1(){

        System.out.println("下午睡觉："+System.currentTimeMillis());
    }
}
