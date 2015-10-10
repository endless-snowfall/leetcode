package leetcode.problems.problem00083;

import leetcode.problems.common.ListNode;

public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode newHead = head;
        ListNode newTail = head;
        int tailValue = newTail.val;

        head = head.next;

        while (head != null) {
            if (head.val != tailValue) {
                newTail.next = head;
                newTail = head;
                tailValue = head.val;
            }
            head = head.next;
        }

        newTail.next = null;
        return newHead;
    }
}
