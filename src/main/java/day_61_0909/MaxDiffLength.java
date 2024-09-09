package day_61_0909;

// https://www.codewars.com/kata/5663f5305102699bad000056/train/java

public class MaxDiffLength {
    public static int mxdiflg(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) {
            return -1;
        }
        int a1Min = findMin(a1);
        int a1Max = findMax(a1);

        int a2Min = findMin(a2);
        int a2Max = findMax(a2);

        int dif1 = Math.abs(a1Max - a2Min);
        int dif2 = Math.abs(a2Max - a1Min);

        return Math.max(dif1, dif2);
    }

    private static int findMin(String[] str) {
        int min = str[0].length();
        for (int i = 1; i < str.length; i++) {
            if (str[i].length() < min) {
                min = str[i].length();
            }
        }
        return min;
    }

    private static int findMax(String[] str) {
        int max = str[0].length();
        for (int i = 1; i < str.length; i++) {
            if (str[i].length() > max) {
                max = str[i].length();
            }
        }
        return max;
    }
}
