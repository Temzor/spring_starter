package ru.codewars.sevenkyu;

public class Fibonacci {
    public static long fibonacci(long limit) {
        long elementOne = 1;
        long elementTwo = 1;
        long sum = 0;

        while (elementOne < limit) {
            if (elementOne % 2 == 0) {
                sum += elementOne;
            }
            long temp = elementOne;
            elementOne = elementTwo;
            elementTwo += temp;
        }
        return sum;
    }
}