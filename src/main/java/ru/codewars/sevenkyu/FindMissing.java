package ru.codewars.sevenkyu;

import static java.util.stream.IntStream.of;

public class FindMissing {
    public static int findMissing(int[] numbers) {
        return (numbers[0] + numbers[numbers.length - 1]) * (numbers.length + 1) / 2 - of(numbers).sum();
    }
}
