package com.spring.introduction.deadlocklivelocklockstarvation;

public class Thread10 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread10: Попытка захватить монитор объекта LOCK1.");
        synchronized (DeadLock.LOCK1) {
            System.out.println("Thread10: Монитор объекта LOCK1 захвачен.");
            System.out.println("Thread10: Попытка захватить монитор объекта LOCK2.");
            synchronized (DeadLock.LOCK2) {
                System.out.println("Thread10: Монитор объектов LOCK1 и LOCK2 захвачены.");
            }
        }
    }
}
