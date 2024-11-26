package secondchallange.day_37_2611;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        var current = head;
        ListNode prev = null;
        while(current != null) {
            if (prev != null && current.val == prev.val) {
                var next = current.next;
                prev.next = next;
                current = next;
            } else {
                prev = current;
                current = current.next;
            }
        }
        return head;
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
