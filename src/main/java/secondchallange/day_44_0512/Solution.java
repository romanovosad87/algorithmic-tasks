package secondchallange.day_44_0512;

// https://leetcode.com/problems/swapping-nodes-in-a-linked-list/description/

public class Solution {

    public ListNode swapNodes(ListNode head, int k) {
        var current = head;
        int size = 0;
        while(current != null) {
            size++;
            current = current.next;
        }

        int[] arr = new int[size];
        current = head;
        int i = 0;
        while (current != null) {
            if (i == k - 1) {
                arr[size - k] = current.val;
            } else if (i == size - k) {
                arr[k - 1] = current.val;
            } else {
                arr[i] = current.val;
            }
            current = current.next;
            i++;
        }
        ListNode newHead = new ListNode(arr[0], null);
        current = newHead;
        for (int j = 1; j < arr.length; j++) {
            current.next = new ListNode(arr[j], null);
            current = current.next;
        }
        return newHead;
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
