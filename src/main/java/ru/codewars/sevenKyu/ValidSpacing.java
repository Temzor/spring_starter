package ru.codewars.sevenKyu;

public class ValidSpacing {
    public static boolean validSpacing(String s) {
        String trim = s.trim().strip().replaceAll(" {2}", "");
        return trim.length() >= s.length();
    }
}
