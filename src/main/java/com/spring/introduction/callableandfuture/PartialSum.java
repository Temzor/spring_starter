package com.spring.introduction.callableandfuture;

import java.util.concurrent.Callable;

public class PartialSum implements Callable<Long> {
    long from;
    long to;
    long localSum;

    public PartialSum(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Long call() {
        for (long i = from; i <= to; i++) {
            localSum += i;
        }
        System.out.println("Сумма от " + from + " до " + to + " = " + localSum);
        return localSum;
    }
}
