package com.spring.introduction.waitnotify;

public class Market {
    private int breadCount = 0;

    public synchronized void getBread() throws InterruptedException {
        while (breadCount < 1) {
            wait();
        }
        breadCount--;
        System.out.println("Consumer get one bread;");
        System.out.println("Bread left in the store: " + breadCount);
        notify();
    }

    public synchronized void putBread() throws InterruptedException {
        while (breadCount >= 5) {
            wait();
        }
        breadCount++;
        System.out.println("Producer put one bread;");
        System.out.println("Bread left in the store: " + breadCount);
        notify();
    }
}
