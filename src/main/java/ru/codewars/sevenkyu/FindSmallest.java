package ru.codewars.sevenkyu;

public class FindSmallest {
    public static int findSmallest(final int[] numbers, final String toReturn) {
        int result = 0;
        int value = numbers[0];
        if (toReturn.equals("index")) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < value) {
                    result = i;
                    value = numbers[i];
                }
            }
        } else {
            for (int number : numbers) {
                if (number < value) {
                    result = number;
                    value = number;
                }
            }
        }
        return result;
    }
}
