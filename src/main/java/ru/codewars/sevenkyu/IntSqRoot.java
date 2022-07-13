package ru.codewars.sevenkyu;

public class IntSqRoot {
    public static long IntRac(long n, long guess) {
        long count = 0;
        long digits = 0;
        while (Math.abs(guess - digits) >= 1) {
            digits = guess;
            guess = (long) Math.floor((guess + n / guess) / 2);
            count++;
        }
        return count;
    }
}
