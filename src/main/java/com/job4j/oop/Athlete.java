package com.job4j.oop;

public class Athlete extends Sportsman {
    @Override
    public void run() {
        System.out.println("Fast speed to run");
    }

    public void sprint() {
        System.out.println("Fast sprint to short distance");
    }
}
