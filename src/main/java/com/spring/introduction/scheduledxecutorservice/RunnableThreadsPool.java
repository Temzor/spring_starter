package com.spring.introduction.scheduledxecutorservice;

public class RunnableThreadsPool implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
        /*
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
         */
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}
