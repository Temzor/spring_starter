package com.test;

import java.util.*;

/**
 * Should be improved to reduce calculation time.
 *
 * 1. Change this file or create new one using parallel calculation mode.
 * 2. Do not use `executors`, only plain threads  (max threads count which should be created for calculations is com.fitechsource.test.TestConsts#MAX_THREADS)
 * 3. Try to provide simple solution, do not implement frameworks.
 * 4. Don't forget that calculation method can throw exception, process it right way.
 *   (Stop calculation process and print error message. Ignore already calculated intermediate results, user doesn't need it.)
 *
 *   Please attach code files to email - skhisamov@fitechsource.com
 */

public class Test2 {
    public static void main(String[] args) throws TestException, InterruptedException {
        long start = System.currentTimeMillis();
        Set<Double> res = new HashSet<>();

        Thread thread1 = new Thread(() -> {
            for (int j = 0; j < TestConsts.N;j++) {
                try {
                    res.addAll(TestCalc.calculate(j));
                } catch (TestException e) {
                    e.printStackTrace();
                }
            }

        });

        Thread thread2 = new Thread(() -> {
            for (int j = 0; j < TestConsts.N;j++) {
                try {
                    res.addAll(TestCalc.calculate(j));
                } catch (TestException e) {
                    e.printStackTrace();
                }
            }

        });

        Thread thread3 = new Thread(() -> {
            for (int j = 0; j < TestConsts.N;j++) {
                try {
                    res.addAll(TestCalc.calculate(j));
                } catch (TestException e) {
                    e.printStackTrace();
                }
            }

        });

        Thread thread4 = new Thread(() -> {
            for (int j = 0; j < TestConsts.N;j++) {
                try {
                    res.addAll(TestCalc.calculate(j));
                } catch (TestException e) {
                    e.printStackTrace();
                }
            }

        });


//        for (int i = 0; i <= TestConsts.MAX_THREADS; i++) {
//            Thread thread = new Thread(() -> {
//                for (int j = 0; j < TestConsts.N;j++) {
//                    try {
//                        res.addAll(TestCalc.calculate(j));
//                    } catch (TestException e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//            thread.join();
//            thread.start();
//        }




        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println(res);
        long end = System.currentTimeMillis();
        System.out.println(end - start + " ms.");
    }
}
