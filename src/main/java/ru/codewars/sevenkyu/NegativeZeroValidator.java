package ru.codewars.sevenkyu;

public class NegativeZeroValidator {
    public static boolean isNegativeZero(float n) {
        String[] strings = String.valueOf(n).split("");
        return strings[0].equals("-") && strings[1].equals("0");
    }
}
