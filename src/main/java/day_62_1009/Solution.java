package day_62_1009;

// https://leetcode.com/problems/make-the-string-great/description/

public class Solution {
    public String makeGood(String s) {
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
