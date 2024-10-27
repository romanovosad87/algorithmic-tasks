package secondchallange.day_15_2510;

// https://leetcode.com/problems/simplify-path/description/

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        String path = "/a/./b/../../c/";
        System.out.println(simplifyPath(path));
    }

    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        var split = path.split("/+");
        for (String str : split) {
            if (str.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!str.equals(".") && !str.isEmpty()) {
                stack.push(str);
            }
        }

        StringBuilder builder = new StringBuilder();
        for (var el : stack) {
            builder.append("/");
            builder.append(el);
        }
        return (builder.isEmpty()) ? "/" : builder.toString();
    }
}
