package com.spring.introduction.callableandfuture;

import java.util.concurrent.*;

public class CallableFactorial {
    static int factorialResult;

    public static void main(String[] args)  {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        FactorialForCallable factorial = new FactorialForCallable(5);
        Future<Integer> integerFuture = executorService.submit(factorial);
        try {
            factorialResult = integerFuture.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        } finally {
            executorService.shutdown();
        }
        System.out.println(factorialResult);
    }
}
