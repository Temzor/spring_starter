package ru.codewars.sevenkyu;

import java.util.Arrays;

public class LongestWord {
    public static String longestWord(String wordString) {
        int length = 0;
        String result = "";
        String[] split = wordString.split(" ");
        for (String s : split) {
            if (s.length() > length) {
                result = s;
            }
        }
        return result;
    }
}
