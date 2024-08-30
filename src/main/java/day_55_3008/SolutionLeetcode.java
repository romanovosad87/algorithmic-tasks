package day_55_3008;

// https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/description/

import java.util.Arrays;

public class SolutionLeetcode {
    public int minimumDifference(int[] nums, int k) {
        if (k == 1) {
            return 0;
        }

        Arrays.sort(nums);
        int min = 100_000;
        int i = 0;
        int j = k - 1;
        while (j < nums.length) {
            int diff = nums[j] - nums[i];
            if (min > diff) {
                min = diff;
            }
            i++;
            j++;
        }
        return min;
    }
}
