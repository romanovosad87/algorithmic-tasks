package day_65_1309;

// https://leetcode.com/problems/merge-in-between-linked-lists/description/

public class Solution {

    // 1 ms Beats 100.00%
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        var current = list1;
        int i = 0;
        while (i < a - 1) {
            i++;
            current = current.next;
        }
        var temp = current.next;
        while (i < b) {
            i++;
            temp = temp.next;
        }
        current.next = list2;
        var current2 = list2;
        while (current2.next != null) {
            current2 = current2.next;
        }
        current2.next = temp;
        return list1;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
