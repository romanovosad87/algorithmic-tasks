package day_11_0107;

// https://leetcode.com/problems/implement-stack-using-queues/

public class MyStack {
    private Node head;
    private int size;

    public MyStack() {
    }

    public void push(int x) {
        var newNode = new Node(x);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public int pop() {
        var forReturn = head.value;
        head = head.next;
        size--;
        return forReturn;

    }

    public int top() {
        return head.value;

    }

    public boolean empty() {
        return size == 0;
    }

    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
