package com.spring.introduction.callableandfuture;

import java.util.concurrent.Callable;

public class FactorialForCallable implements Callable<Integer> {
    int f;

    public FactorialForCallable(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("Вы ввели не верное число.");
        }

        int result = 1;

        for (int i = 0; i <= f; i++) {
            result *= i;
        }
        return result;
    }
}
