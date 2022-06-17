package ru.codewars.sevenkyu;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWord {
    public static String longestWord(String wordString) {
        String[] split = wordString.split(" ");
        Arrays.sort(split, Comparator.comparingInt(String::length));
        return split[split.length - 1];
    }
}
