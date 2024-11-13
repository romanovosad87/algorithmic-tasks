package secondchallange.day_28_1311;

// https://leetcode.com/problems/single-element-in-a-sorted-array/description/

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[] {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(singleNonDuplicate(nums));
    }

    public static int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int middle = left + (right - left) / 2;

            if (middle % 2 != 0) {
                middle--;
            }

            if (nums[middle] == nums[middle + 1]) {
                left = middle + 2;
            } else {
                right = middle;
            }
        }

        return nums[left];
    }
}
