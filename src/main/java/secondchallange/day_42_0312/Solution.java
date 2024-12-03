package secondchallange.day_42_0312;

// https://neetcode.io/problems/reorder-linked-list

public class Solution {

    // brute force solution
    public void reorderList(ListNode head) {
        int size = 0;
        var current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        ListNode[] array = new ListNode[size];
        current = head;
        int j = 0;
        while (current != null) {
            array[j++] = current;
            current = current.next;
        }

        ListNode[] reorderArray = new ListNode[size];
        for (int i = 0; i < reorderArray.length; i++) {
            if (i % 2 == 0) {
                reorderArray[i] = array[i / 2];
            } else {
                int idx = size - (i + 1) /2;
                reorderArray[i] = array[idx];
            }
        }

        for (int i = 0; i < reorderArray.length - 1; i++) {
            reorderArray[i].next = reorderArray[i + 1];
        }
        reorderArray[reorderArray.length -1].next = null;
    }

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
