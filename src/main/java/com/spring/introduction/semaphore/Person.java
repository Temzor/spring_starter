package com.spring.introduction.semaphore;

import java.util.concurrent.Semaphore;

public class Person extends Thread {
    private final String name;
    private final Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ждёт...");
            callBox.acquire();
            System.out.println(name + " пользуется телефонной будкой");
            sleep(2000);
            System.out.println(name + " завершил звонок");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            callBox.release();
        }
    }
}
