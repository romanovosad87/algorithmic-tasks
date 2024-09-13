package day_63_1109;

// https://codewars.com/kata/556196a6091a7e7f58000018/train/java

public class Solution {
    public static int largestPairSum(int[] numbers){
        int l1 = Math.max(numbers[0], numbers[1]);
        int l2 = Math.min(numbers[0], numbers[1]);
        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] > l1) {
                l2 = l1;
                l1 = numbers[i];
            } else if (numbers[i] > l2) {
                l2 = numbers[i];
            }
        }
        return l1 + l2;
    }
}
