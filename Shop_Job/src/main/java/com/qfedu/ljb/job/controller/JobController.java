package com.qfedu.ljb.job.controller;

import org.quartz.SchedulerException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class JobController {

    @GetMapping("job/start.do")
    public String start(String cron) throws SchedulerException {

        return "OK";
    }
}
