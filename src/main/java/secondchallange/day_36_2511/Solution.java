package secondchallange.day_36_2511;

// https://leetcode.com/problems/remove-linked-list-elements/description/

public class Solution {

    public ListNode removeElements(ListNode head, int val) {
        var current = head;
        ListNode prev = null;
        while (current != null) {
            if (current.val == val) {
                if (current == head) {
                    head = head.next;
                    current = current.next;
                } else {
                    var next = current.next;
                    prev.next = next;
                    current = next;
                }
            } else {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }

    public ListNode removeElementsChatGpt(ListNode head, int val) {
        ListNode dummy = new ListNode(0, head);
        ListNode current = head;
        ListNode prev = dummy;

        while (current != null) {
            if (current.val == val) {
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }
        return dummy.next;
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
