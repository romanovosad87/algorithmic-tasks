package day_56_0209;

// https://www.codewars.com/kata/57ee99a16c8df7b02d00045f/train/java

import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(flattenAndSort(new int[][]{{}, {1}})));
    }

    public static int[] flattenAndSort(int[][] array) {
        int totalElements = 0;
        for (int[] subArray : array) {
            totalElements += subArray.length;
        }

        int[] result = new int[totalElements];
        int k = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                result[k++] = anInt;
            }
        }
        Arrays.sort(result);
        return result;
    }
}
