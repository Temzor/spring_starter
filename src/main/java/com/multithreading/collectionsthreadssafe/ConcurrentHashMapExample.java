package com.multithreading.collectionsthreadssafe;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> hashMap = new ConcurrentHashMap<>();
        hashMap.put(1, "Dmitrii");
        hashMap.put(2, "Oleg");
        hashMap.put(3, "Sergei");
        hashMap.put(4, "Anna");
        hashMap.put(5, "Ira");

        Runnable runnable1 = () -> {
            for (Integer integer : hashMap.keySet()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(integer + " : " + hashMap.get(integer));
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("I work");
            hashMap.put(6, "Vasya");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(hashMap);
    }
}
