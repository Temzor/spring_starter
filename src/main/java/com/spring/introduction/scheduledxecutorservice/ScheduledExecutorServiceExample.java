package com.spring.introduction.scheduledxecutorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService
                = Executors.newScheduledThreadPool(1);


        scheduledExecutorService.schedule(new RunnableThreadsPool(), 3, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(new RunnableThreadsPool(), 3, 1, TimeUnit.SECONDS);


        scheduledExecutorService.scheduleWithFixedDelay(new RunnableThreadsPool(), 3, 1, TimeUnit.SECONDS);
        Thread.sleep(20000);
        scheduledExecutorService.shutdown();

        ExecutorService executorService = Executors.newCachedThreadPool();
    }
}
