package leetcode.problems.problem00148;

import leetcode.problems.common.ListNode;

public class MergeSortSolution {

    public ListNode sortList(ListNode head) {
        return mergesort(head, getLength(head));
    }

    private int getLength(ListNode node) {
        return (node == null) ? 0 : 1 + getLength(node.next);
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
        ListNode result = null;
        ListNode resultTail = null;

        while (n1 != null || n2 != null) {
            if (n1 == null) {
                if (result == null) {
                    return n2;
                }
                resultTail.next = n2;
                break;
            }

            if (n2 == null) {
                if (result == null) {
                    return n1;
                }
                resultTail.next = n1;
                break;
            }

            if (n1.val <= n2.val) {
                if (result == null && resultTail == null) {
                    result = n1;
                } else {
                    resultTail.next = n1;
                }
                resultTail = n1;
                n1 = n1.next;
                resultTail.next = null;
                continue;
            }

            if (n1.val > n2.val) {
                if (result == null && resultTail == null) {
                    result = n2;
                } else {
                    resultTail.next = n2;
                }
                resultTail = n2;
                n2 = n2.next;
                resultTail.next = null;
                continue;
            }
        }

        return result;
    }
}
