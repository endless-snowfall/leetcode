package leetcode.problems.problem00109;

import leetcode.problems.common.ListNode;
import leetcode.problems.common.TreeNode;

public class Solution {

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }

        return helper(head);
    }

    private TreeNode helper(ListNode start) {
        if (start == null) {
            return null;
        } else if (start.next == null) {
            return new TreeNode(start.val);
        } else if (start.next.next == null) {
            TreeNode result = new TreeNode(start.val);
            result.right = new TreeNode(start.next.val);
            return result;
        }

        ListNode prevToMid = getPrevToMid(start);
        ListNode midNode = prevToMid.next;
        TreeNode treeNode = new TreeNode(midNode.val);

        prevToMid.next = null;
        treeNode.left = helper(start);

        if (midNode.next != null) {
            ListNode nextToMid = midNode.next;
            midNode.next = null;
            treeNode.right = helper(nextToMid);
        }

        return treeNode;
    }

    private ListNode getPrevToMid(ListNode node) {
        ListNode mid = node;
        ListNode prevToMid = mid;
        ListNode faster = node;

        while (mid != null && faster != null && faster.next != null && faster.next.next != null) {
            prevToMid = mid;
            mid = mid.next;
            faster = faster.next.next;
        }

        return prevToMid;
    }
}
