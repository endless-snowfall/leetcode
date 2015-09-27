package leetcode.problems.problem00203;

import leetcode.problems.common.ListNode;

public class Solution {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        ListNode result = findNewHead(head, val);
        if (result == null) {
            return null;
        }

        ListNode prev = result;
        ListNode node = prev.next;

        while (node != null) {
            if (node.val == val) {
                prev.next = node.next;
                node = node.next;
            } else {
                prev = prev.next;
                node = node.next;
            }
        }

        return result;
    }

    private ListNode findNewHead(ListNode head, int val) {
        ListNode result = head;

        while (result != null && result.val == val) {
            result = result.next;
        }

        return result;
    }
}
