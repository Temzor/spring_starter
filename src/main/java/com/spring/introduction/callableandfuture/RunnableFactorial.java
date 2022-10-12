package com.spring.introduction.callableandfuture;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunnableFactorial {
    static int factorialResult;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(5);
        executorService.execute(factorial);

        executorService.awaitTermination(10, TimeUnit.SECONDS);
        executorService.shutdown();

        System.out.println(factorialResult);

    }
}
