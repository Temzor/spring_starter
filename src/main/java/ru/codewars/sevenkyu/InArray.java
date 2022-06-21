package ru.codewars.sevenkyu;

import java.util.ArrayList;
import java.util.Arrays;

public class InArray {
    public static String[] inArray(String[] array1, String[] array2) {
        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array2[j].contains(array1[i])) {
                    strings.add(array1[i]);
                }

            }
        }
        Object[] strings1 = strings.stream().distinct().toArray();

        return Arrays.copyOf(strings1, strings1.length, String[].class);
    }
}
