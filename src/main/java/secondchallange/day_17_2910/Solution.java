package secondchallange.day_17_2910;

// https://leetcode.com/problems/remove-k-digits/description/

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        System.out.println(removeKdigits("1432219", 3));
    }

    public static String removeKdigits(String num, int k) {
        Stack<Integer> stack = new Stack<>();
        for (var charDigit : num.toCharArray()) {
            int digit = charDigit - 48;
            while (!stack.isEmpty() && stack.peek() > digit && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder builder = new StringBuilder();
        for (var digit : stack) {
            if (builder.isEmpty() && digit == 0) {
                continue;
            } else {
                builder.append(digit);
            }
        }
        return builder.isEmpty() ? "0" : builder.toString();
    }
}
