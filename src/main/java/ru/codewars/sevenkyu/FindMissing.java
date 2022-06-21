package ru.codewars.sevenkyu;

public class FindMissing {
    public static int findMissing(int[] numbers) {

        int different = (numbers[numbers.length - 1] - numbers[0]) / numbers.length;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] + different != numbers[i + 1] ) {
                return numbers[i] + different;
            }
        }
        return numbers[0];
    }
}
