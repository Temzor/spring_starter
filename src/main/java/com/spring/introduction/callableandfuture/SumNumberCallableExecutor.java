package com.spring.introduction.callableandfuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SumNumberCallableExecutor {
    private static final long VALUE = 1_000_000_000L;
    private static long sum = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Long>> futuresResults = new ArrayList<>();
        long valueDividedBy10 = VALUE / 10;

        for (int i = 1; i <= 10; i++) {
            long from = valueDividedBy10 * i + 1;
            long to = valueDividedBy10 * (i + i);
            PartialSum task = new PartialSum(from, to);
            Future<Long> futurePartialSum = executorService.submit(task);
            futuresResults.add(futurePartialSum);
        }
        for (Future<Long> futuresResult : futuresResults) {
            sum += futuresResult.get();
        }

        executorService.shutdown();
        System.out.println("Сумма равна:" + sum);
    }
}
