package com.spring.introduction.ioc;

public class TestDog {
    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.say();
    }
}