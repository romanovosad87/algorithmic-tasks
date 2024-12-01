package secondchallange.day_34_2111;

// https://neetcode.io/problems/merge-two-sorted-linked-lists

public class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        var head = list1.val < list2.val ? list1 : list2;
        var current = head;
        var current1 = list1;
        var current2 = list2;
        if (current1 == head) {
            current1 = current1.next;
        } else {
            current2 = current2.next;
        }

        while (current1 != null && current2 != null) {
            if (current1.val < current2.val) {
                current.next = current1;
                current1 = current1.next;
            } else {
                current.next = current2;
                current2 = current2.next;
            }
            current = current.next;
        }

        current.next = current1 != null ? current1 : current2;
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
