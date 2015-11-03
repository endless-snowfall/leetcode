package leetcode.problems.problem00098;

import leetcode.problems.common.TreeNode;

public class Solution {

    public boolean isValidBST(TreeNode root) {
        if (root == null || root.left == null && root.right == null) {
            return true;
        }

        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode node, int minInclusive, int maxInclusive) {
        if (node.val < minInclusive || node.val > maxInclusive) {
            return false;
        }

        if (!isLeftValidBST(node, minInclusive)) {
            return false;
        }

        return isRightValidBST(node, maxInclusive);
    }

    private boolean isRightValidBST(TreeNode node, int maxInclusive) {
        if (node.right == null) {
            return true;
        }

        if (node.val == Integer.MAX_VALUE) {
            return false;
        }

        return isValidBST(node.right, node.val + 1, maxInclusive);
    }

    private boolean isLeftValidBST(TreeNode node, int minInclusive) {
        if (node.left == null) {
            return true;
        }

        if (node.val == Integer.MIN_VALUE) {
            return false;
        }

        return isValidBST(node.left, minInclusive, node.val - 1);
    }
}
