package ru.codewars.sevenkyu;

public class SubstringTest {
    public static boolean substringTest(String str1, String str2) {
        for (int i = 0; i < str2.length() - 1; i++) {
            if (str1.toLowerCase().contains(str2.toLowerCase().substring(i, i + 2))) {
                return true;
            }
        }
        return false;
    }
}