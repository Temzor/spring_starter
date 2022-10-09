package com.spring.introduction.lockreentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Call {
    private final Lock lock = new ReentrantLock();

    void mobileCall() {
        lock.lock();
        try {
            System.out.println("Method mobileCall starts;");
            Thread.sleep(3000);
            System.out.println("Method mobileCall ends;");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        } finally {
            lock.unlock();
        }
    }

    void skypeCall() {
        lock.lock();
        try {
            System.out.println("Method skypeCall starts;");
            Thread.sleep(5000);
            System.out.println("Method skypeCall ends;");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        } finally {
            lock.unlock();
        }
    }

    void whatsappCall() {
        lock.lock();
        try {
            System.out.println("Method whatsappCall starts;");
            Thread.sleep(7000);
            System.out.println("Method whatsappCall ends;");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        } finally {
            lock.unlock();
        }
    }
}
