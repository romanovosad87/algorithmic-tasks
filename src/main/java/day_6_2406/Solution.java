package day_6_2406;

// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/

public class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        var str1 = String.join("", word1);
        var str2 = String.join("", word2);
        return str1.equals(str2);
    }
}
