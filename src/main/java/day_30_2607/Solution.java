package day_30_2607;

// https://leetcode.com/problems/climbing-stairs/description/
// https://www.youtube.com/watch?v=Y0lT9Fck7qI

public class Solution {

    public int climbStairs(int n) {
        int one = 1;
        int two = 1;

        for (int i = 1; i < n; i++) {
            int temp = one;
            one = one + two;
            two = temp;
        }

        return one;
    }
}
