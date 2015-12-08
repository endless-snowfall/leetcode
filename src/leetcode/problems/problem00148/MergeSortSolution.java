package leetcode.problems.problem00148;

import leetcode.problems.common.ListNode;

public class MergeSortSolution {

    public ListNode sortList(ListNode head) {
        return mergesort(head, getLength(head));
    }

    private int getLength(ListNode node) {
        int result = 0;
        while (node != null) {
            result++;
            node = node.next;
        }
        return result;
    }

    private ListNode mergesort(ListNode node, int length) {
        if (length == 0) {
            return null;
        } else if (length == 1) {
            return node;
        }

        int mid = length / 2;
        ListNode n2 = split(node, mid);
        return merge(mergesort(node, mid), mergesort(n2, length - mid));
    }

    private ListNode split(ListNode node, int mid) {
        ListNode beforeResult = node;
        for (int i = 0; i < mid - 1; i++) {
            beforeResult = beforeResult.next;
        }
        ListNode result = beforeResult.next;
        beforeResult.next = null;
        return result;
    }

    private ListNode merge(ListNode n1, ListNode n2) {
        ListNode result = new ListNode(0);
        ListNode resultTail = result;

        while (n1 != null || n2 != null) {
            if (n1 == null) {
                resultTail.next = n2;
                resultTail = n2;
                break;
            }

            if (n2 == null) {
                resultTail.next = n1;
                resultTail = n1;
                break;
            }

            if (n1.val <= n2.val) {
                resultTail.next = n1;
                n1 = n1.next;
            } else {
                resultTail.next = n2;
                n2 = n2.next;
            }

            resultTail = resultTail.next;
            resultTail.next = null;
        }

        return result.next;
    }
}
