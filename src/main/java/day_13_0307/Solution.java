package day_13_0307;

// https://leetcode.com/problems/search-insert-position/submissions/1308328433/

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        var nums = new int[]{1, 3, 5, 6};
        System.out.println(solution.searchInsert(nums, 5));
    }

    public int searchInsert(int[] nums, int target) {
        if (target < nums[0]) {
            return 0;
        } else if (target > nums[nums.length - 1]) {
            return nums.length;
        } else {
            int start = 0;
            int end = nums.length - 1;
            while (start <= end) {
                int middle = start + (end - start) / 2;
                if (nums[middle] == target) {
                    return middle;
                } else if (target > nums[middle]) {
                    start = middle + 1;
                } else if (target < nums[middle]) {
                    end = middle - 1;
                }
            }
            return start;
        }
    }
}
