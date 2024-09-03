package day_57_0309;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class SolutionLeetcode {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[left - 1]) {
                nums[left] = nums[i];
                left++;
            }
        }
        return left;
    }
}
