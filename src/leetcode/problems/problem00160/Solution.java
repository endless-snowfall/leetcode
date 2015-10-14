package leetcode.problems.problem00160;

import leetcode.problems.common.ListNode;

public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        int lengthA = getLength(headA);
        int lengthB = getLength(headB);

        if (lengthA > lengthB) {
            headA = advance(headA, lengthA - lengthB);
        } else if (lengthB > lengthA) {
            headB = advance(headB, lengthB - lengthA);
        }

        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }

    private ListNode advance(ListNode node, int positions) {
        ListNode result = node;
        for (int i = 0; i < positions; i++) {
            result = result.next;
        }
        return result;
    }

    private int getLength(ListNode node) {
        int result = 0;
        while (node.next != null) {
            result++;
            node = node.next;
        }
        return result;
    }
}
