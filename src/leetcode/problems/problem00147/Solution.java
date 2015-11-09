package leetcode.problems.problem00147;

import leetcode.problems.common.ListNode;

public class Solution {

    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode result = null;

        while (head != null) {
            ListNode nextHead = head.next;
            result = insert(head, result);
            head = nextHead;
        }

        return result;
    }

    private ListNode insert(ListNode newNode, ListNode result) {
        newNode.next = null;

        if (result == null) {
            return newNode;
        }

        if (newNode.val <= result.val) {
            newNode.next = result;
            return newNode;
        }

        ListNode head = result;

        while (result != null) {
            if (result.next == null) {
                result.next = newNode;
                break;
            } else if (newNode.val <= result.next.val) {
                newNode.next = result.next;
                result.next = newNode;
                break;
            }
            result = result.next;
        }

        return head;
    }
}
