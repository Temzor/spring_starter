package ru.codewars.sevenkyu;

public class IntSqRoot {
    public static long IntRac(long n, long guess) {
        long x = (guess + n / guess) / 2;
        return Math.abs(guess - x) < 1 ? 1 : 1 + IntRac(n, x);
    }
}
