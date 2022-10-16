package com.spring.introduction.countdownlath;

import java.util.concurrent.CountDownLatch;

public class Customer extends Thread {
    private final String name;
    private final CountDownLatch countDownLatch;

    public Customer(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " приступил к покупке");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
