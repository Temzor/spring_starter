package ru.codewars.sevenkyu;

public class Fibonacci {
    public static long fibonacci(long max) {
        if (max < 2) {
            return 0;
        }

        long elementFirst = 0;
        long elementSecond = 2;
        long sum = elementFirst + elementSecond;

        while (true) {
            long elementThird = 4 * elementSecond + elementFirst;
            if (elementThird >= max) {
                break;
            }

            elementFirst = elementSecond;
            elementSecond = elementThird;
            sum += elementSecond;
        }
        return (int) sum;
    }
}