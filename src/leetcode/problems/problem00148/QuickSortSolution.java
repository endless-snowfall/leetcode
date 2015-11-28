package leetcode.problems.problem00148;

import java.util.Random;

import leetcode.problems.common.ListNode;

public class QuickSortSolution {

    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }

        Random random = new Random();
        int length = getLength(head);
        return quicksort(head, length, random);
    }

    private int getLength(ListNode node) {
        return (node == null) ? 0 : 1 + getLength(node.next);
    }

    private ListNode quicksort(ListNode node, int length, Random random) {
        int pivotIndex = random.nextInt(length);
        int pivotValue = getValue(node, pivotIndex);
        return null;
    }

    private int getValue(ListNode node, int index) {
        return (index == 0) ? node.val : getValue(node.next, index - 1);
    }
}
