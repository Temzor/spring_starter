package com.multithreading.atomicinteger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread threadFirst = new Thread(new ThreadRunnable());
        Thread threadSecond = new Thread(new ThreadRunnable());

        threadFirst.start();
        threadSecond.start();
        threadFirst.join();
        threadSecond.join();

        System.out.println(AtomicIntegerExample.counter);
    }
}
