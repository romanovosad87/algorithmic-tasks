package day_3_1906;

// https://leetcode.com/problems/concatenation-of-array/description/

public class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] ans = new int[size * 2];
        System.arraycopy(nums, 0, ans, 0, size);
        System.arraycopy(nums, 0, ans, size, size);
        return ans;
    }
}
