package secondchallange.day_45_0612;

// https://leetcode.com/problems/design-linked-list/description/

public class MyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {

    }

    public int get(int index) {
        int res = -1;
        if (index < 0 || index >= size) {
            return res;
        }

        var current = head;
        int i = 0;
        while (current != null) {
            if (i == index) {
                res = current.val;
                break;
            }
            i++;
            current = current.next;
        }
        return res;
    }

    public void addAtHead(int val) {
        var newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addAtTail(int val) {
        var newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }

        var newNode = new Node(val);
        if (index == 0) {
            if (head == null) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        } else if (index == size) {
            tail.next = newNode;
            tail = newNode;
        } else {
            var current = head;
            Node prev = null;
            int i = 0;
            while(current != null) {
                if (i == index) {
                    var next = prev.next;
                    prev.next = newNode;
                    newNode.next = next;
                }
                i++;
                prev = current;
                current = current.next;
            }
        }
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }

        if (index == 0) {
            head = head.next;
        } else {
            var current = head;
            int i = 0;
            while (current != null) {
                if (i == index - 1) {
                    current.next = current.next.next;
                    if (index == size - 1) {
                        tail = current;
                    }
                }
                i++;
                current = current.next;
            }
        }
        size--;
    }

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
