package ru.codewars.sevenkyu;

import java.util.*;

public class InArray {
    public static String[] inArray(String[] array1, String[] array2) {
        Set<String> strings = new TreeSet<>();

        for (String s : array1) {
            for (String value : array2) {
                if (value.contains(s)) {
                    strings.add(s);
                }

            }
        }

        for (String string : strings) {
            System.out.println(string);
        }



        return strings.toArray(new String[0]);
    }
}
