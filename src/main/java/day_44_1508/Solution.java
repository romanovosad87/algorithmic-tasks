package day_44_1508;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum/description/

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = new int[]{2, 7, 11, 15};
        System.out.println(Arrays.toString(solution.twoSum(array, 9)));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                res = new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return res;
    }
}
