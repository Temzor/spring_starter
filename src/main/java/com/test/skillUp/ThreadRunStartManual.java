package com.test.skillUp;

public class ThreadRunStartManual implements Runnable {

    @Override
    public void run() {
        System.out.println("Method run. Thread name = "
        + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadRunStartManual());
        thread.start();
        System.out.println("Method main. Thread name = "
                + Thread.currentThread().getName());
    }
}
