package ru.codewars.sevenkyu;

public class ValidSpacing {
    public static boolean validSpacing(String s) {
        return s.trim().replace("  ", "").equals(s);
    }
}
