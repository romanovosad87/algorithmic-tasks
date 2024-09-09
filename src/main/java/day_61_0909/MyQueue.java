package day_61_0909;

// https://leetcode.com/problems/implement-queue-using-stacks/description/

public class MyQueue {
    private Node head;
    private Node tail;

    public MyQueue() {

    }

    public void push(int x) {
        var node = new Node(x);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public int pop() {
        var element = head.element;
        head = head.next;
        return element;
    }

    public int peek() {
        return head.element;
    }

    public boolean empty() {
        return head == null;
    }

    static class Node {
        int element;
        Node next;

        public Node(int element) {
            this.element = element;
        }
    }
}
