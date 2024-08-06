package day_38_0708;

// https://www.codewars.com/kata/57f609022f4d534f05000024/train/java

public class Solution {
    static int stray(int[] numbers) {
        int res = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            res ^= numbers[i];
        }
        return res;
    }
}
