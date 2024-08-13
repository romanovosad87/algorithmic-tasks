package day_42_1308;

// https://leetcode.com/problems/is-subsequence/description/

public class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            var sym = s.charAt(i);

            while (j < t.length()) {
                if (sym == t.charAt(j++)) {
                    count++;
                    break;
                }
            }
        }
        return count == s.length();
    }
}
