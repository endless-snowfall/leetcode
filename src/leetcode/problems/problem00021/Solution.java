package leetcode.problems.problem00021;

import leetcode.problems.common.ListNode;

public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;

        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                ListNode lowerNode = getLowerNode(l1, l2);

                if (head == null) {
                    head = lowerNode;
                    tail = lowerNode;
                } else {
                    tail.next = lowerNode;
                    tail = tail.next;
                }

                if (l1 == lowerNode) {
                    l1 = l1.next;
                } else {
                    l2 = l2.next;
                }
            } else if (l1 == null || l2 == null) {
                ListNode nonEmptyList = (l1 == null) ? l2 : l1;

                if (head == null) {
                    head = nonEmptyList;
                } else {
                    tail.next = nonEmptyList;
                }
                break;
            }
        }

        return head;
    }

    private ListNode getLowerNode(ListNode l1, ListNode l2) {
        return (l1.val <= l2.val) ? l1 : l2;
    }
}
