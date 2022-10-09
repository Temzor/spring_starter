package com.spring.introduction.lockreentrantlock;

public class LockExample {
    public static void main(String[] args) {
        Call call = new Call();

        Thread threadFirst = new Thread(call::mobileCall);
        Thread threadSecond = new Thread(call::skypeCall);
        Thread threadThird = new Thread(call::whatsappCall);

        threadFirst.start();
        threadSecond.start();
        threadThird.start();
    }
}
