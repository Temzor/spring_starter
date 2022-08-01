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
    static Set<Double> res = new HashSet<>();

    public static void main(String[] args)  {
        long start = System.currentTimeMillis();
        System.out.println("Main thread started...");
        for (int i = 0; i < TestConsts.MAX_THREADS; i++) {
            Thread thread = new JThread();
            thread.start();
            if (i == 0) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            }
        }
        System.out.println(Test2.res);
        System.out.println("Main thread finished...");
        long end = System.currentTimeMillis();
        System.out.println(end - start + " ms.");
    }

}



class JThread extends Thread {

    @Override
    public void run() {
        for (int j = 0; j < TestConsts.N; j++) {
            try {
                Test2.res.addAll(TestCalc.calculate(j));
            } catch (TestException e) {
                e.printStackTrace();
            }
        }
    }
}

