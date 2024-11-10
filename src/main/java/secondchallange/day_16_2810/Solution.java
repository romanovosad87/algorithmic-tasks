package secondchallange.day_16_2810;

// https://leetcode.com/problems/decode-string/description/

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        System.out.println(decodeString("3[a2[c]]"));
    }

    public static String decodeString(String s) {

        Stack<Character> stack = new Stack<>();
        for (var c : s.toCharArray()) {
            if (c == ']') {
                List<Character> subChar = new ArrayList<>();
                while (!stack.isEmpty() && stack.peek() != '[') {
                    subChar.addFirst(stack.pop());
                }
                stack.pop();

                int count = 0;
                int multiply = 1;
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    int digit = stack.pop() - 48;
                    count = digit * multiply + count;
                    multiply *= 10;
                }

                for (int i = 0; i < count; i++) {
                    stack.addAll(subChar);
                }

            } else {
                stack.push(c);
            }
        }
        return stack.stream()
            .map(String::valueOf)
            .collect(Collectors.joining());
    }

}
