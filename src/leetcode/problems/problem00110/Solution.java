package leetcode.problems.problem00110;

import leetcode.problems.common.TreeNode;

public class Solution {

    public boolean isBalanced(TreeNode root) {
        return helper(root) != -1;
    }

    private int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = helper(root.left);

        if (leftDepth == -1) {
            return -1;
        }

        int rightDepth = helper(root.right);

        if (rightDepth == -1) {
            return -1;
        }

        if (Math.abs(leftDepth - rightDepth) > 1) {
            return -1;
        }

        return 1 + Math.max(leftDepth, rightDepth);
    }
}
