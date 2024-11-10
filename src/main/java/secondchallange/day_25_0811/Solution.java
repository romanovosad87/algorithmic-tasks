package secondchallange.day_25_0811;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[] {-4, -1, 0, 3, 10};
        int[] ints = sortedSquares(nums);
        System.out.println(Arrays.toString(ints));

    }
    public static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int i = nums.length - 1;
        int[] res = new int[nums.length];
        while (left <= right) {
            if (Math.abs(nums[left] * nums[left]) > Math.abs(nums[right] * nums[right])) {
                res[i] = nums[left] * nums[left];
                left++;
            } else {
                res[i] = nums[right] * nums[right];
                right--;
            }
            i--;
        }
        return res;
    }
}
