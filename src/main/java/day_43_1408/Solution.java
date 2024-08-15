package day_43_1408;

// https://leetcode.com/problems/length-of-last-word/description/

public class Solution {

    // 0ms Beats 100.00%
    public int lengthOfLastWord(String s) {
        var trimS = s.trim();
        int i = trimS.length() - 1;
        int res = 0;
        while(i >= 0 && trimS.charAt(i) != ' ') {
            res++;
            i--;
        }
        return res;
    }

    // 2ms Beats 13.00%
    public int lengthOfLastWordBruteForce(String s) {
        var words = s.split("\\s+");
        return words[words.length - 1].length();
    }
}
