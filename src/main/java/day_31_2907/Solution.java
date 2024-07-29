package day_31_2907;

// https://leetcode.com/problems/min-cost-climbing-stairs/description/
// https://www.youtube.com/watch?v=ktmzAZWkEZ0

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }
    public int minCostClimbingStairs(int[] cost) {
        int next = cost[cost.length - 1];
        int afterNext = 0;
        for (int i = cost.length - 2; i >= 0; i--) {
            var temp = cost[i] + Math.min(next, afterNext);
            afterNext = next;
            next = temp;
        }
        return Math.min(next, afterNext);
    }
}
