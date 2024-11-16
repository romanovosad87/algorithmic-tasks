package secondchallange.day_30_1611;

// https://leetcode.com/problems/find-peak-element/description/

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 1, 3, 5, 6, 4};
        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        var left = 0;
        var right = nums.length - 1;
        while (left < right) {
            var mid = (right + left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
