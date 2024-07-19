package day_25_1907;

// https://leetcode.com/problems/sum-of-all-subset-xor-totals/description/
// https://www.youtube.com/watch?v=LI7YR-bwNYY

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {5, 1, 6};
        System.out.println(solution.subsetXORSumRecursively(nums));
        System.out.println(solution.subsetXORSum(nums));
    }

    public int subsetXORSumRecursively(int[] nums) {
        return calculateXOR(nums, 0, 0);
    }

    private int calculateXOR(int[] nums, int index, int currentXOR) {
        if (index == nums.length) {
            return currentXOR;
        }

        int current = calculateXOR(nums, index + 1, currentXOR ^ nums[index]);
        int withoutCurrent = calculateXOR(nums, index + 1, currentXOR);

        return current + withoutCurrent;
    }

    public int subsetXORSum(int[] nums) {
        int result = 0;
        for (var num : nums) {
            result = result | num;
        }
        return  result * (int)Math.pow(2, nums.length - 1);
    }
}
