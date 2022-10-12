package com.spring.introduction.callableandfuture;

import java.util.concurrent.*;

public class CallableFactorial {
    static int factorialResult;

    public static void main(String[] args)  {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        FactorialForCallable factorial = new FactorialForCallable(2);
        Future<Integer> integerFuture = executorService.submit(factorial);
        try {
            System.out.println(integerFuture.isDone());
            System.out.println("Хотим получить результат");
            factorialResult = integerFuture.get();
            System.out.println("Получили результат");
            System.out.println(integerFuture.isDone());
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
