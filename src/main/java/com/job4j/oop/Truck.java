package com.job4j.oop;

public class Truck extends Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Electron button accelerate");
    }

    @Override
    public void steer() {
        System.out.println("Standard steer");
    }
}
