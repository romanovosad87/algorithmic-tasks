package secondchallange.day_6_1410;

// https://neetcode.io/problems/minimum-stack

public class MinStack {

    private Node head;
    private int min;

    public MinStack() {

    }

    public void push(int val) {
        var newNode = new Node(val);
        if (head == null) {
            head = newNode;
            min = val;
        } else {
            newNode.min = min;
            newNode.next = head;
            head = newNode;
            if (min > val) {
                min = val;
            }
        }
    }

    public void pop() {
        if (head != null) {
            min = head.min;
            head = head.next;
        }
    }

    public int top() {
        return head.value;
    }

    public int getMin() {
        return min;
    }

    static class Node {
        int value;
        Node next;
        int min;

        public Node(int value) {
            this.value = value;
        }
    }
}
