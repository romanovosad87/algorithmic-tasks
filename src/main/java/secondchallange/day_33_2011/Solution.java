package secondchallange.day_33_2011;

// https://neetcode.io/problems/reverse-a-linked-list

public class Solution {
    public ListNode reverseList(ListNode head) {
        var current = head;
        ListNode prev = null;
        while(current != null) {
            var next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
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
