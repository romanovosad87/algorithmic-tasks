package secondchallange.day_7_1510;

// https://neetcode.io/problems/evaluate-reverse-polish-notation

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        String operations = "+*/-";
        for (var token : tokens) {
            if (token.length() == 1 && operations.contains(token)) {
                var last = stack.pollLast();
                var beforLast = stack.pollLast();
                switch (token) {
                    case "+" -> stack.add(last + beforLast);
                    case "*" -> stack.add(last * beforLast);
                    case "-" -> stack.add(beforLast - last);
                    case "/" -> stack.add(beforLast / last);
                }
            } else {
                stack.add(Integer.parseInt(token));
            }
        }
        return stack.pollLast();
    }
}
