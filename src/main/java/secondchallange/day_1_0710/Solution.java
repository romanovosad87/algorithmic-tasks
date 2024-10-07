package secondchallange.day_1_0710;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();

        for(var p : s.toCharArray()) {
            if (p == '(' || p == '{' || p == '[') {
                stack.add(p);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                var pFromStack = stack.pop();
                if (Math.abs(p - pFromStack) > 2) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
