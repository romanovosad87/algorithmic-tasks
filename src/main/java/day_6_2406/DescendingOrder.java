package day_6_2406;

// https://www.codewars.com/kata/5467e4d82edf8bbf40000155/train/java

import java.util.Arrays;
import java.util.List;

public class DescendingOrder {
    public static void main(String[] args) {
        System.out.println(sortDesc(145263));

    }
    public static int sortDesc(final int num) {
        //Your code
        int[] array = getArray(num);
        sort(array);
        int result = 0;
        for(int i = 0; i < array.length; i++) {
            result = array[i] * (int)Math.pow(10, i)  + result;
        }
        return result;
    }

    private static int[] getArray(int num) {
        int size = ("" + num).length();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = num % 10;
            num /= 10;
        }
        return array;
    }

    private static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            var current = arr[i];
            int j = i -1;
            while (j >= 0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }
}
