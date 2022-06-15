package ru.codewars.sevenkyu;

public class Compare {
    public static boolean compare(String s1, String s2) {
        int sumS1 = 0;
        int sumS2 = 0;

        if (s1 == null || !s1.matches("[a-zA-Z]+")) {
            s1 = "";
        }
        if (s2 == null || !s2.matches("[a-zA-Z]+")) {
            s2 = "";
        }

        if (!s1.isEmpty()) {
            for (char ch : s1.toUpperCase().toCharArray()) {
                sumS1 = sumS1 + (int) ch;
            }
        }
        if (!s2.isEmpty()) {
            for (char ch : s2.toUpperCase().toCharArray()) {
                sumS2 = sumS2 + (int) ch;
            }
        }
        return sumS1 == sumS2;
    }
}
