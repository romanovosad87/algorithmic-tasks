package day_1_1706;

// https://leetcode.com/problems/contains-duplicate/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> integerSet = new HashSet();

        for (int i = 0; i < nums.length; i++) {
            if (!integerSet.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
