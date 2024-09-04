package day_58_0409;

// https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/


public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = new int[]{2,2,2,2,5,5,5,8};
        System.out.println(solution.numOfSubarrays(array, 3, 4));

    }

    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int num = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        if (sum / k >= threshold) {
            num++;
        }

        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            if (sum / k >= threshold) {
                num++;
            }
        }
        return num;
    }
}
