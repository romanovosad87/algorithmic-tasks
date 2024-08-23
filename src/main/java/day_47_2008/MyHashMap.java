package day_47_2008;

// https://leetcode.com/problems/design-hashmap/description/

public class MyHashMap {
    private Node[] table;

    public MyHashMap() {
        table = new Node[10];
    }

    public void put(int key, int value) {
        var newNode = new Node(key, value);
        int index = index(key);
        if (table[index] == null) {
            table[index] = newNode;
        } else {
            var current = table[index];
            Node prev = null;
            while(current != null) {
                if (current.key == key) {
                    current.value = value;
                    return;
                }
                prev = current;
                current = current.next;
            }
            prev.next = newNode;
        }
    }

    public int get(int key) {
        int index = index(key);
        var current = table[index];
        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }
        return -1;
    }

    public void remove(int key) {
        int index = index(key);
        var current = table[index];
        Node prev = null;
        while (current != null) {
            if (current.key == key) {
                if (prev == null) {
                    table[index] = current.next;
                    current.next = null;
                } else {
                    prev.next = current.next;
                    current.next = null;
                }
            }
            prev = current;
            current = current.next;
        }
    }

    private int index(int key) {
        return key % table.length;
    }

    static class Node {
        int key;
        int value;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
