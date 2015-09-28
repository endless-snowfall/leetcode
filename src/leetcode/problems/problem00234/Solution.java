package leetcode.problems.problem00234;

import leetcode.problems.common.ListNode;

public class Solution {

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }

        int numDigits = getNumDigits(head);

        if (numDigits == 1) {
            return true;
        }

        ListNode reversedList = head;
        ListNode node = head.next;
        head.next = null;

        for (int i = 1; i < numDigits / 2; i++) {
            ListNode next = node.next;
            node.next = reversedList;
            reversedList = node;
            node = next;
        }

        boolean hasEvenDigits = (numDigits % 2 == 0);
        if (!hasEvenDigits) {
            node = node.next;
        }

        return areListsEqual(node, reversedList);
    }

    private int getNumDigits(ListNode head) {
        int result = 0;
        while (head != null) {
            head = head.next;
            result++;
        }
        return result;
    }

    private boolean areListsEqual(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return true;
        } else if (list1.val != list2.val) {
            return false;
        } else {
            return areListsEqual(list1.next, list2.next);
        }
    }
}
