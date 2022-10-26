package com.multithreading.collectionsthreadssafe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollectionExample1 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> arrayList = new ArrayList<>();


        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }

        List<Integer> synchronizedList = Collections.synchronizedList(arrayList);

        Runnable runnable1 = () -> {
            synchronized (synchronizedList) {
                for (Integer integer : synchronizedList) {
                    System.out.println(integer);
                }
            }
        };

        Runnable runnable2 = () -> synchronizedList.remove(10);

        Thread threadFirst = new Thread(runnable1);
        Thread threadSecond = new Thread(runnable2);

        threadFirst.start();
        threadSecond.start();
        threadFirst.join();
        threadSecond.join();

        System.out.println(synchronizedList);
    }
}
