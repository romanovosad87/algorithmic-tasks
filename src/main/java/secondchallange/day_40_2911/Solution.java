package secondchallange.day_40_2911;

// https://leetcode.com/problems/merge-in-between-linked-lists/description/

public class Solution {

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        var current = list1;
        ListNode prev = null;
        int i = 0;
        while(current != null) {
            if (i == a) {
                if (prev != null) {
                    prev.next = list2;
                } else {
                    list1 = list2;
                }
                while (list2.next != null) {
                    list2 = list2.next;
                }
            } if (i == b) {
                list2.next = current.next;
                current.next = null;
                break;
            }
            prev = current;
            current = current.next;
            i++;
        }
        return list1;
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
