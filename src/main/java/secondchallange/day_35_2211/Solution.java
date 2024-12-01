package secondchallange.day_35_2211;

// https://leetcode.com/problems/palindrome-linked-list/description/

public class Solution {

    public boolean isPalindrome(ListNode head) {
        if (head.next == null) {
            return true;
        }
        int[] array = new int[100000];
        var current = head;
        int size = 0;
        while (current != null) {
            array[size] = current.val;
            current = current.next;
            size++;
        }
        int left = 0;
        int right = size - 1;
        while(left < size) {
            if (array[left] != array[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
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
