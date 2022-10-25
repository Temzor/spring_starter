package com.multithreading.atomicinteger;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {

    static AtomicInteger counter = new AtomicInteger();

    public static void increment() {
        counter.incrementAndGet();
    }
}
