package com.multithreading.atomicinteger;

public class ThreadRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            AtomicIntegerExample.increment();
        }
    }
}
