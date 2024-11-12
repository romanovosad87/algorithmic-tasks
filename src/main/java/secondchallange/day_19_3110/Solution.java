package secondchallange.day_19_3110;

// https://leetcode.com/problems/132-pattern/description/

import java.util.Stack;

public class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Pair> stack = new Stack<>();
        int min = Integer.MAX_VALUE;
        for (var num : nums) {
            while (!stack.isEmpty() && num >= stack.peek().num()) {
                stack.pop();
            }

            if (!stack.isEmpty() && num > stack.peek().min()) {
                return true;
            }

            stack.push(new Pair(num, min));
            min = Math.min(min, num);
        }
        return false;
    }
}

record Pair(int num, int min){}
