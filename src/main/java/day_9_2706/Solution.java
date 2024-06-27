package day_9_2706;

import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/description/

public class Solution {

    public boolean isValid(String s) {

        Stack<Character> charStack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char parenthesis = s.charAt(i);
            if (parenthesis == '(' || parenthesis == '{' || parenthesis == '[') {
                charStack.push(parenthesis);
            } else {
                if (charStack.isEmpty()) {
                    return false;
                }
                char fromStack = charStack.pop();
                if (Math.abs(parenthesis - fromStack) > 2) {
                    return false;
                }
            }
        }
        return charStack.isEmpty();
    }
}
