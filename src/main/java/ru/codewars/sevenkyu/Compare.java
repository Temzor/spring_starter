package ru.codewars.sevenkyu;

public class Compare {
    public static boolean compare(String s1, String s2) {
        if (s1 == null || !s1.matches("[a-zA-Z]+")) {
            s1 = "";
        }
        if (s2 == null || !s2.matches("[a-zA-Z]+")) {
            s2 = "";
        }

        return s1.toUpperCase().chars().sum() == s2.toUpperCase().chars().sum();
    }
}
