package com.spring.introduction.deadlocklivelocklockstarvation;

public class DeadLock {
    public final static Object LOCK1 = new Object();
    public final static Object LOCK2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();

        thread10.start();
        thread20.start();
    }
}
