package day_4_2006;

// https://leetcode.com/problems/assign-cookies/description/

import java.util.Arrays;

public class Solution {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int childPointer = 0;
        int cookiePointer = 0;
        int result = 0;
        while (childPointer < g.length && cookiePointer < s.length) {
            int child = g[childPointer];
            int cookie = s[cookiePointer];
            if (child <= cookie) {
                childPointer++;
                cookiePointer++;
                result++;
            }

            if (child > cookie) {
                cookiePointer++;
            }

        }
        return result;
    }
}
