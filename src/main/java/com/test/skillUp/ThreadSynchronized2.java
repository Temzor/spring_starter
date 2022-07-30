package com.test.skillUp;

public class ThreadSynchronized2 {
    static int counter = 0;

    public static synchronized void increment() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable2());
        Thread thread2 = new Thread(new Runnable2());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}

class Runnable2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            ThreadSynchronized2.increment();
        }
    }
}
