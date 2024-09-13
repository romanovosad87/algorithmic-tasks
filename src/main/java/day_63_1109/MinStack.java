package day_63_1109;

// https://leetcode.com/problems/min-stack/description/

public class MinStack {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }

    private Node head;

    public MinStack() {
    }

    public void push(int val) {
        Node newNode;
        if (head == null) {
            newNode = new Node(val, val);
            head = newNode;
        } else {
            newNode =  new Node(val, Math.min(val, head.min));
            newNode.next = head;
            head = newNode;
        }
    }

    public void pop() {
        if (head != null) {
            head = head.next;
        }
    }

    public int top() {
        if (head != null) {
            return head.value;
        }
        throw new RuntimeException("My stack is empty");
    }

    public int getMin() {
        if (head != null) {
            return head.min;
        }
        throw new RuntimeException("My stack is empty");
    }

    private static class Node {
        int value;
        int min;
        Node next;

        Node(int value, int min) {
            this.value = value;
            this.min = min;
        }
    }
}
