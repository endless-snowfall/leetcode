package leetcode.problems.problem00092;

import leetcode.problems.common.ListNode;

public class Solution {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || m == 0 || n == 0 || n < m) {
            return null;
        }

        int length = getLength(head);

        if (n > length) {
            return null;
        } else if (m == n) {
            return head;
        }

        ListNode previousToM;
        ListNode mNode;
        ListNode nNode;

        if (m == 1) {
            previousToM = null;
            mNode = head;
            nNode = getNodeAheadBy(mNode, n - m);
        } else {
            previousToM = getNodeAheadBy(head, m - 2);
            mNode = previousToM.next;
            nNode = getNodeAheadBy(previousToM, n - m + 1);
        }

        ListNode afterN = nNode.next;
        ListNode reversedHead = reverseSublist(mNode, n - m);

        // Re-attach stuff
        mNode.next = afterN;

        if (m == 1) {
            return reversedHead;
        } else {
            previousToM.next = reversedHead;
            return head;
        }
    }

    private ListNode reverseSublist(ListNode start, int count) {
        ListNode head = start;
        ListNode node = start.next;
        start.next = null;

        for (int i = 0; i < count; i++) {
            ListNode next = node.next;
            node.next = head;
            head = node;
            node = next;
        }

        return head;
    }

    private ListNode getNodeAheadBy(ListNode start, int index) {
        ListNode result = start;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result;
    }

    private int getLength(ListNode head) {
        int result = 0;
        while (head != null) {
            result++;
            head = head.next;
        }
        return result;
    }
}
