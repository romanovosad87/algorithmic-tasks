package day_10_2806;

import java.util.Stack;

// https://leetcode.com/problems/baseball-game/description/

public class Solution {

    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack();
        for (var oper : operations) {
            if (oper.equals("D")) {
                var num = stack.peek();
                stack.push(num * 2);
            } else if (oper.equals("C")) {
                stack.pop();
            } else if (oper.equals("+")) {
                var num1 = stack.pop();
                var num2 = stack.peek();
                stack.push(num1);
                stack.push(num1 + num2);
            } else {
                stack.push(Integer.valueOf(oper));
            }
        }
        return stack.isEmpty() ? 0 : stack.stream().mapToInt(i -> i).sum();
    }
}
