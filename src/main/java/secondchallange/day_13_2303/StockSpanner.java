package secondchallange.day_13_2303;

// https://leetcode.com/problems/online-stock-span/description/

import java.util.Stack;

public class StockSpanner {

    private Stack<Integer> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
        if (!stack.isEmpty()) {
            while (!stack.isEmpty() && stack.peek() <= price) {
                stack.pop();
                span += stack.pop();
            }
        }
        stack.push(span);
        stack.push(price);

        return span;
    }
}
