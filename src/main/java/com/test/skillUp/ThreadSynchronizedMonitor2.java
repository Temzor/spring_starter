package com.test.skillUp;

public class ThreadSynchronizedMonitor2 {
    volatile static  int counter = 0;

    public static void increment() {
        synchronized (ThreadSynchronizedMonitor2.class) {
            counter++;
        }
    }

    public static void main(String[] args) {
        MyRunnableImpl3 myRunnableImpl3 = new MyRunnableImpl3();

        Thread thread1 = new Thread(myRunnableImpl3);
        Thread thread2 = new Thread(myRunnableImpl3);
        Thread thread3 = new Thread(myRunnableImpl3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter3 {
    static int count = 0;
}

class MyRunnableImpl3 implements Runnable {
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
