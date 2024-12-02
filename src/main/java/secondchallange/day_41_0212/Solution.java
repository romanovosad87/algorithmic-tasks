package secondchallange.day_41_0212;

// https://leetcode.com/problems/remove-nodes-from-linked-list/description/

import java.util.Stack;

public class Solution {

    public ListNode removeNodes(ListNode head) {
        Stack<Integer> stack = new Stack();
        var current = head;
        while(current != null) {
            while (!stack.isEmpty() && current.val > stack.peek()) {
                stack.pop();
            }
            stack.push(current.val);
            current = current.next;
        }

        ListNode newHead = null;
        if (!stack.isEmpty()) {
            newHead = new ListNode(stack.get(0));
        }
        current = newHead;
        for (int i = 1; i < stack.size(); i++) {
            current.next = new ListNode(stack.get(i));
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
