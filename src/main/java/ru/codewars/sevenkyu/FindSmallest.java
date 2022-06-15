package ru.codewars.sevenkyu;

import java.util.Objects;

public class FindSmallest {
    public static int findSmallest(final int[] numbers, final String toReturn) {
        int lowest = 0;
        for (int i = 1; i < numbers.length; ++i) {
            if (numbers[i] < numbers[lowest]) {
                lowest = i;
            }
        }
        return (Objects.equals(toReturn, "index")) ? lowest : numbers[lowest];
    }
}
