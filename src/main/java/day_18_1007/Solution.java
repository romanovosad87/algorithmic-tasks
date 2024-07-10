package day_18_1007;

// https://leetcode.com/problems/palindrome-linked-list/description/

public class Solution {
  public static void main(String[] args) {
    ListNode listNode = new ListNode(1);
    listNode.next = new ListNode(2);
    listNode.next.next = new ListNode(2);
    listNode.next.next.next = new ListNode(1);
    System.out.println(isPalindrome(listNode));
  }

  public static boolean isPalindrome(ListNode head) {
    if (head.next == null) {
      return true;
    }
    var current = head;
    ListNode newList = null;
      while (current != null) {
          newList = new ListNode(current.val, newList);
          current = current.next;
      }

      while (head != null && newList != null) {
          if (head.val != newList.val) {
              return false;
          }
          head = head.next;
          newList = newList.next;
      }
    return true;
  }

    public static class ListNode {
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
