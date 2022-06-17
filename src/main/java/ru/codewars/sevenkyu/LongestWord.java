package ru.codewars.sevenkyu;

import java.util.Arrays;

public class LongestWord {
    public static String longestWord(String wordString) {
        return Arrays.stream(wordString.split(" "))
                .reduce((x, y) -> x.length() <= y.length() ? y : x).get();
    }
}
