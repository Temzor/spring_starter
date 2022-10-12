package com.spring.introduction.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolNewSingleThreadExecutor {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            newSingleThreadExecutor.execute(new RunnableThreadsPool());
        }
        newSingleThreadExecutor.shutdown();


    }
}
