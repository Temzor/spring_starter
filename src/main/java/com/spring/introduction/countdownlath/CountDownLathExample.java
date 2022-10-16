package com.spring.introduction.countdownlath;

import java.util.concurrent.CountDownLatch;

public class CountDownLathExample {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffInOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Персонал магазина готов к работе");
        countDownLatch.countDown();
        System.out.println("countDownLatch " + countDownLatch.getCount());
    }

    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Все готово, можем отрывать магазин");
        countDownLatch.countDown();
        System.out.println("countDownLatch " + countDownLatch.getCount());
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Магазин открыт");
        countDownLatch.countDown();
        System.out.println("countDownLatch " + countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        new Customer("Dmitrii", countDownLatch);
        new Customer("Anna", countDownLatch);
        new Customer("Lena", countDownLatch);
        new Customer("Oleg", countDownLatch);
        new Customer("Nikita", countDownLatch);

        marketStaffInOnPlace();
        everythingIsReady();
        openMarket();
    }
}
