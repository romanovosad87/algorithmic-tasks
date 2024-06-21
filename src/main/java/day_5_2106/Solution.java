package day_5_2106;

// https://leetcode.com/problems/backspace-string-compare/description/

public class Solution {

    public boolean backspaceCompare(String s, String t) {

        int i = s.length() - 1;
        int j = t.length() - 1;
        while (i >= 0 || j >= 0) {
            i = findNextCharIndex(s, i);
            j = findNextCharIndex(t, j);

            if (i < 0 && j < 0) {
                return true;
            }
            if (i < 0 || j < 0) {
                return false;
            }

            if (s.charAt(i) != t.charAt(j)) {
                return false;
            }
            i--;
            j--;
        }
        return true;
    }

    private int findNextCharIndex(String str, int index) {
        int match = 0;
        while (index >=0) {
           if (str.charAt(index) == '#') {
               match++;
        } else {
               if (match > 0) {
                   match--;
               } else {
                   break;
               }
           }
            index--;
        }

        if (index >= 0 && str.charAt(index) == '#') {
            return findNextCharIndex(str, index);
        }
        return index;
    }
}
