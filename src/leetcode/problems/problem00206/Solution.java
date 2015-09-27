package leetcode.problems.problem00206;

import leetcode.problems.common.ListNode;

public class Solution {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode newHead = head;
        ListNode node = head.next;
        head.next = null;

        while (node != null) {
            ListNode next = node.next;
            node.next = newHead;
            newHead = node;
            node = next;
        }

        return newHead;
    }
}
