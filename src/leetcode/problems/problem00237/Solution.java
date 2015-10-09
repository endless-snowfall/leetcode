package leetcode.problems.problem00237;

import leetcode.problems.common.ListNode;

public class Solution {

    public void deleteNode(ListNode node) {
        if (node == null) {
            return;
        }

        while (node.next != null) {
            node.val = node.next.val;
            if (node.next.next == null) {
                node.next = null;
            } else {
                node = node.next;
            }
        }
    }
}
