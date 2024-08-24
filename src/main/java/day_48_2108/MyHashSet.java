package day_48_2108;

// https://leetcode.com/problems/design-hashset/description/

public class MyHashSet {
    private Node[] table;

    public MyHashSet() {
        table = new Node[200000];
    }

    public void add(int key) {
        int index = index(key);
        var newNode = new Node(key);
        if (table[index] == null) {
            table[index] = newNode;
        } else {
            var current = table[index];
            Node prev = null;
            while(current != null) {
                if (current.key == key) {
                    return;
                }
                prev = current;
                current = current.next;
            }
            prev.next = newNode;
        }
    }

    public void remove(int key) {
        int index = index(key);
        var current = table[index];
        Node prev = null;
        while (current != null) {
            if (key == current.key) {
                if (prev == null) {
                    table[index] = null;
                    return;
                } else {
                    prev.next = current.next;
                    current.next = null;
                    return;
                }
            }
            prev = current;
            current = current.next;
        }

    }

    public boolean contains(int key) {
        int index = index(key);
        var current = table[index];
        while(current != null) {
            if (current.key == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    private int index(int key) {
        return key % table.length;
    }

    static class Node {
        int key;
        Node next;

        public Node(int key) {
            this.key = key;
        }
    }
}
