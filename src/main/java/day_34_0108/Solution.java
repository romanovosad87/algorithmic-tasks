package day_34_0108;

// https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/

public class Solution {

    public int maxDepth(String s) {
        int depth = 0;
        int parenthes = 0;
        for (var c : s.toCharArray())  {
            if (c == '(') {
                parenthes++;
                depth = Math.max(parenthes, depth);
            } else if (c == ')') {
                parenthes--;
            }
        }
        return depth;
    }
}
