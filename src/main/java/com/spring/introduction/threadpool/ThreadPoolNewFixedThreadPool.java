package com.spring.introduction.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolNewFixedThreadPool {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts.");
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new RunnableThreadsPool());
        }
        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);

        System.out.println("Main ends.");
    }
}
