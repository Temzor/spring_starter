package com.test.skillUp;

public class ThreadTestRunnable2 {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Hi!")).start();

        new Thread(() -> System.out.println("Hi? you!")).start();
    }
}
