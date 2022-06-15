package ru.codewars.sevenkyu;

public class DingleMouse {
    public static int[] paintLetterboxes(final int start, final int end) {
        int[] result = new int[10];
        for (int i = start; i <= end; i++) {
            String[] value = String.valueOf(i).split("");
            for (String s : value) {
                switch (s) {
                    case  ("0"):
                        result[0]++;
                        break;
                    case ("1"):
                        result[1]++;
                        break;
                    case ("2"):
                        result[2]++;
                        break;
                    case ("3"):
                        result[3]++;
                        break;
                    case ("4"):
                        result[4]++;
                        break;
                    case ("5"):
                        result[5]++;
                        break;
                    case ("6"):
                        result[6]++;
                        break;
                    case ("7"):
                        result[7]++;
                        break;
                    case ("8"):
                        result[8]++;
                        break;
                    default:
                        result[9]++;
                        break;
                }
            }
        }
        return result;
    }
}
