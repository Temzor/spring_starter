package com.test.skillUp;

public class ThreadSynchronized1 {
    public static void main(String[] args) {
        MyRunnableImpl1 myRunnableImpl1 = new MyRunnableImpl1();

        Thread thread1 = new Thread(myRunnableImpl1);
        Thread thread2 = new Thread(myRunnableImpl1);
        Thread thread3 = new Thread(myRunnableImpl1);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter1 {
    static int count = 0;
}

class MyRunnableImpl1 implements Runnable {
    public synchronized void increment() {
        Counter1.count++;
        System.out.print(Counter1.count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}
