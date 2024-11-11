package secondchallange.day_18_3010;

// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/description/

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        String s = "deeedbbcccbdaa";
        var k = 3;
        System.out.println(removeDuplicates(s, k));
    }

    public static String removeDuplicates(String s, int k) {
        Stack<Pair> stack = new Stack<>();
        for (var c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek().character == c) {
                stack.push(new Pair(c, stack.pop().count + 1));
            } else {
                stack.push(new Pair(c, 1));
            }

            if (stack.peek().count == k) {
                stack.pop();
            }
        }
        StringBuilder builder = new StringBuilder();
        for (var pair : stack) {
            builder.append(String.valueOf(pair.character).repeat(pair.count));
        }
        return builder.toString();
    }

    record Pair(Character character, int count) {
    }
}
