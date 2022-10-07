package com.spring.introduction.deadlocklivelocklockstarvation;

public class Thread20 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread20: Попытка захватить монитор объекта LOCK2.");
        synchronized (DeadLock.LOCK2) {
            System.out.println("Thread20: Монитор объекта LOCK2 захвачен.");
            System.out.println("Thread20: Попытка захватить монитор объекта LOCK1.");
            synchronized (DeadLock.LOCK1) {
                System.out.println("Thread20: Монитор объектов LOCK1 и LOCK2 захвачены.");
            }
        }
    }
}
