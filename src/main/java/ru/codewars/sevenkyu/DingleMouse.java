package ru.codewars.sevenkyu;

public class DingleMouse {
    public static int[] paintLetterboxes(final int start, final int end) {
        int[] result = new int[10];
        for (int i = start; i <= end; i++) {
            int num = i;
            while (num > 0) {
                result[num % 10]++;
                num /= 10;
            }
        }
        return result;
    }
}
