package day_2_1806;

import java.util.Arrays;

// https://leetcode.com/problems/valid-anagram/description/

public class Solution {
    public boolean isAnagram(String s, String t) {
        var sArray = s.toCharArray();
        var tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
    }
}
