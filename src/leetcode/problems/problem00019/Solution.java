package leetcode.problems.problem00019;

import leetcode.problems.common.ListNode;

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n < 1) {
            return null;
        }

        ListNode end = head;
        ListNode prevToNFromEnd = null;

        for (int i = 1; i < n; i++) {
            end = end.next;
        }

        while (end.next != null) {
            end = end.next;
            prevToNFromEnd = (prevToNFromEnd == null) ? head : prevToNFromEnd.next;
        }

        if (prevToNFromEnd == null) {
            return head.next;
        }

        prevToNFromEnd.next = prevToNFromEnd.next.next;
        return head;
    }
}
