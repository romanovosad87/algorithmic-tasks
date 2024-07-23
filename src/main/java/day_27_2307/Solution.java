package day_27_2307;

// https://leetcode.com/problems/find-the-difference/description/

public class Solution {

    // 2 ms Beats 69.04%
    public char findTheDifference(String s, String t) {
        int difference = 0;

        for (int i = 0; i < t.length(); i++) {
            difference += t.charAt(i);
            if (i < s.length()) {
                difference -= s.charAt(i);
            }
        }
        return (char) difference;
    }

    // 1 ms Beats 100.00%
    public char findTheDifferenceBitwise(String s, String t) {
        char ch = 0;
        for (char c : s.toCharArray()) {
            ch ^= c;
        }
        for (char c : t.toCharArray()) {
            ch ^= c;
        }
        return ch;
    }
}
