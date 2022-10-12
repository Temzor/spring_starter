package com.spring.introduction.callableandfuture;

public class Factorial implements Runnable {
    int f;

    public Factorial(int f) {
        this.f = f;
    }

    @Override
    public void run() {
        if (f <= 0) {
            System.out.println("Вы ввели не верное число.");
            return;
        }
        int result = 1;
        for (int i = 0; i <= f; i++) {
            result *= i;
        }
        RunnableFactorial.factorialResult = result;
    }
}
