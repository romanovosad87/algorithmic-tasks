package day_34_0108;

// https://www.codewars.com/kata/563cf89eb4747c5fb100001b/train/java

import java.util.Arrays;

public class Remover {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeSmallest(new int[]{5, 3, 2, 1, 4})));
    }

    public static int[] removeSmallest(int[] numbers) {
        if (numbers.length == 0) {
            return numbers;
        }
        int minIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[minIndex] > numbers[i]) {
                minIndex = i;
            }
        }
        int[] newArray = new int[numbers.length - 1];
        for (int i = 0, j = 0; i < numbers.length; i++) {
            if (i != minIndex) {
                newArray[j++] = numbers[i];
            }
        }
        return newArray;
    }
}
