package day_64_1209;

// https://leetcode.com/problems/reorder-list/description/

public class LeetcodeSolution {

    // brute force
    public void reorderList(ListNode head) {
        var current = head;
        while (current != null) {
            var tail = current;
            ListNode prev = null;
            while (tail.next != null) {
                prev = tail;
                tail = tail.next;
            }
            if (prev != null) {
                prev.next = null;
            }
            var next = current.next;
            current.next = tail;
            tail.next = next;
            current = next;
        }
    }

    // 2 ms Beats 83.52%
    public void reorderListOptimal(ListNode head) {
        ListNode middle = findMiddle(head);
        var secondList = middle.next;
        middle.next = null;
        ListNode secondListHead = reverseList(secondList);
        while (secondListHead != null) {
            var tempFirsList = head.next;
            var tempSecondList = secondListHead.next;
            head.next = secondListHead;
            secondListHead.next = tempFirsList;
            head = tempFirsList;
            secondListHead = tempSecondList;
        }
    }

    private ListNode reverseList(ListNode head) {
        var current = head;
        ListNode prev = null;
        while (current != null) {
            var next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    private ListNode findMiddle(ListNode head) {
        var slow = head;
        var fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
