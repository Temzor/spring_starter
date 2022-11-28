package com.job4j.duty;

public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] number) {
        StringBuilder result = new StringBuilder("(");
        for (int i = 0; i < number.length; i++) {
            result.append(number[i]);
            if (i == 2) {
                result.append(") ");
            }
            if (i == 5) {
                result.append("-");
            }
        }
        return result.toString();
    }
}
