package ru.codewars.sevenKyu;

public class GenerateIntegers {
    public static int[] generateIntegers(int m, final int n) {
        System.out.println(m + " "  + n);
        int[] result = new int[n - m + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = m;
            m++;
        }

        return result;
    }
}
