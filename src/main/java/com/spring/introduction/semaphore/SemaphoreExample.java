package com.spring.introduction.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);

        new Person("Dmitrii", callBox);
        new Person("Anna", callBox);
        new Person("Vlad", callBox);
        new Person("Lena", callBox);
        new Person("Oleg", callBox);

    }
}
