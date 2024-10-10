package secondchallange.day_4_1010;

import java.util.Stack;

// https://leetcode.com/problems/implement-queue-using-stacks/description/

public class MyQueue {
    Stack<Integer> queue;
    Stack<Integer> queue2;

    public MyQueue() {
        queue = new Stack<>();
        queue2 = new Stack<>();
    }

    public void push(int x) {
        queue.push(x);
    }

    public int pop() {
        while (!queue.isEmpty()) {
            queue2.push(queue.pop());
        }
        Integer value = queue2.pop();
        while (!queue2.isEmpty()) {
            queue.push(queue2.pop());
        }
        return value;
    }

    public int peek() {
        while (!queue.isEmpty()) {
            queue2.push(queue.pop());
        }
        Integer value = queue2.peek();
        while (!queue2.isEmpty()) {
            queue.push(queue2.pop());
        }
        return value;
    }

    public boolean empty() {
       return queue.isEmpty();
    }
}
