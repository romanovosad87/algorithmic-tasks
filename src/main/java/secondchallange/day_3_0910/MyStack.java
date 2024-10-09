package secondchallange.day_3_0910;

// https://leetcode.com/problems/implement-stack-using-queues/description/

import java.util.ArrayDeque;
import java.util.Deque;

public class MyStack {

    Deque<Integer> stack;

    public MyStack() {
        stack = new ArrayDeque<>();
    }

    public void push(int x) {
       stack.add(x);
    }

    public int pop() {
       return stack.pollLast();
    }

    public int top() {
        return stack.peekLast();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
