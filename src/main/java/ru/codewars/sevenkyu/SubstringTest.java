package ru.codewars.sevenkyu;

public class SubstringTest {
    public static boolean substringTest(String str1, String str2) {
        int counter = 0;
        String[] stringsFirstSplit = str1.split("");
        String[] stringsSecondSplit = str2.split("");

        for (String s : stringsFirstSplit) {
            for (String value : stringsSecondSplit) {
                if (s.equals(value)) {
                    counter++;
                    if (counter > 1) {
                        break;
                    }
                }
            }
        }
        return counter > 1;
    }
}
