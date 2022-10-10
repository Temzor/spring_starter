package com.spring.introduction.interruptionthread;

public class InterruptionExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread starts.");

        InterruptionThread interruptionThread = new InterruptionThread();
        interruptionThread.start();
        Thread.sleep(2000);
        interruptionThread.interrupt();
        interruptionThread.join();


        System.out.println("Main thread ends.");
    }
}
