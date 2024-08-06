package day_37_0608;

// https://leetcode.com/problems/single-number/submissions/1346184240/

public class SolutionLeetcode {
    public int singleNumber(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }
}
