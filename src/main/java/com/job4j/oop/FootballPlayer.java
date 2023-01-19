package com.job4j.oop;

public class FootballPlayer extends Sportsman {
    @Override
    public void run() {
        System.out.println("Middle speed to run");
    }

    public void footKick() {
        System.out.println("Kick ball");
    }
}
