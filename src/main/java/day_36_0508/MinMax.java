package day_36_0508;

// https://www.codewars.com/kata/559590633066759614000063/train/java

public class MinMax {

    public static int[] minMax(int[] arr) {
        int[] minMax = new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};
        for (var num : arr) {
            if (minMax[0] > num) {
                minMax[0] = num;
            }
            if (minMax[1] < num) {
                minMax[1] = num;
            }
        }
        return minMax;
    }
}
