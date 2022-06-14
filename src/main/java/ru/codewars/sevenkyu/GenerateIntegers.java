package ru.codewars.sevenkyu;

import java.util.stream.IntStream;

public class GenerateIntegers {
    public static int[] generateIntegers(int m, final int n) {
        return IntStream.rangeClosed(m, n).toArray();
    }
}
