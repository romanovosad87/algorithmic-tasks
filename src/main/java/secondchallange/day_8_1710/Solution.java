package secondchallange.day_8_1710;

// https://leetcode.com/problems/removing-stars-from-a-string/description/

public class Solution {
    public String removeStars(String s) {
        StringBuilder builder = new StringBuilder();
        for (var c : s.toCharArray()) {
            if (c == '*') {
                builder.deleteCharAt(builder.length() - 1);
            } else {
                builder.append(c);
            }
        }
        return builder.toString();
    }
}
