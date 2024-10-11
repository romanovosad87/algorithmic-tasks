package secondchallange.day_5_1110;

// https://leetcode.com/problems/make-the-string-great/description/

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public static void main(String[] args) {
        System.out.println(makeGood("abBAcC"));
    }

    public static String makeGood(String s) {
        Deque<Character> queue = new ArrayDeque<>();
        char[] charArray = s.toCharArray();
        queue.add(charArray[0]);
        for (int i = 1; i < charArray.length; i++) {
            char c = s.charAt(i);
            if (!queue.isEmpty() && Math.abs(c - queue.peekLast()) == 32) {
                queue.pollLast();
            } else {
                queue.add(c);
            }
        }
        StringBuilder builder = new StringBuilder();
        for (var c : queue) {
            builder.append(c);
        }
        return builder.toString();
    }

    public static String makeGoodEfficient(String s) {
        StringBuilder builder = new StringBuilder();
        for (char charAt : s.toCharArray()) {
            int length = builder.length();
            if (length > 0 && Math.abs(builder.charAt(length - 1) - charAt) == 32) {
                builder.deleteCharAt(length - 1);
            } else {
                builder.append(charAt);
            }
        }
        return builder.toString();
    }

}
