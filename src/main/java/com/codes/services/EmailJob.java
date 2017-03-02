package com.codes.services;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by amold on 06/01/17.
 */
public class EmailJob implements Job {

    @Autowired
    private EmailServices emailServices;

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        emailServices.sendMain();;
    }
}
