package ru.codewars.sevenKyu;

public class ValidSpacing {
    public static boolean validSpacing(String s) {
        return s.trim().replace("  ", "").equals(s);
    }
}
