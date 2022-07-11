package ru.codewars.sevenkyu;

public class NumbersWithDigitInside {
    public static long[] numbersWithDigitInside(long x, long d) {
        long count = 0, sum = 0, prod = 0;

        for (long i = 1; i <= x; i++) {
            if (String.valueOf(i).contains(String.valueOf(d))) {
                count++;
                sum += i;
                prod = prod == 0 ? i : prod * i;
            }
        }

        return new long[]{count, sum, prod};
    }
}
