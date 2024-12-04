package secondchallange.day_43_0412;

import java.util.Stack;

public class Solution {

    // brute force solution
    public int pairSum(ListNode head) {
        Stack<Integer> stack = new Stack();
        var current = head;
        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }

        int i = 0;
        int res = 0;
        current = head;
        var size = stack.size();
        while (i < size / 2) {
            res = Math.max(res, stack.pop() + current.val);
            i++;
            current = current.next;
        }
        return res;
    }

    public int pairSumEfficient(ListNode head) {
        var fast = head;
        var slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        var current = slow;
        ListNode prev = null;
        while (current != null) {
            var next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        int res = 0;
        current = head;
        while (current != null && prev != null) {
            res = Math.max(res, current.val + prev.val);
            current = current.next;
            prev = prev.next;
        }
        return res;
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
