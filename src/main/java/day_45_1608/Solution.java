package day_45_1608;

// https://leetcode.com/problems/longest-common-prefix/description/

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = new String[]{"dog","racecar","car"};
        System.out.println(solution.longestCommonPrefix(strs));
    }

    // 0 ms Beats 100.00%
    public String longestCommonPrefix(String[] strs) {

            String prefix = strs[0];
            for (int i = 0; i < strs.length; i++) {
                if (!strs[i].startsWith(prefix)) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.isEmpty()) {
                        return "";
                    }
                    i--;
                }
            }
            return prefix;
    }
}
