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

public class TestStandard {
    public static void main(String[] args) throws TestException {
        long start = System.currentTimeMillis();
        Set<Double> res = new HashSet<>();

        for (int i = 0; i < TestConsts.N; i++) {
            res.addAll(TestCalc.calculate(i));
        }

        System.out.println(res);
        long end = System.currentTimeMillis();
        System.out.println(end - start + " ms.");
    }
}
