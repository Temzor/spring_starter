package ru.codewars.sevenkyu;

import java.util.Arrays;

public class ModifiedSum {
    public static int modifiedSum(int[] array, int power) {
        return Arrays.stream(array).map(x -> (int) Math.pow(x, power) - x).sum();
    }
}
