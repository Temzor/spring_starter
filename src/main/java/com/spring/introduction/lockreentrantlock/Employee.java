package com.spring.introduction.lockreentrantlock;

import java.util.concurrent.locks.Lock;

public class Employee extends Thread {
    private final String name;
    private final Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        if (lock.tryLock()) {
            try {
           /*
            System.out.println(name + " wait...");
            lock.lock();
            */
                System.out.println(name + " used bankomat;");
                Thread.sleep(2000);
                System.out.println(name + " finished;");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " doesn't want to wait;");
        }
    }
}
