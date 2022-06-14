package ru.codewars.sevenkyu;

import java.util.Arrays;

public class MinimumSteps {
    public static int minimumSteps(int[] numbers, int k) {
        int counter = 0;
        int sum = 0;
        Arrays.sort(numbers);

        for (int number : numbers) {
            sum += number;
            if (sum < k) {
                counter++;
            }
        }

        return counter;
    }
}
