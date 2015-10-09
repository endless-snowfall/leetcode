package leetcode.problems.problem00112;

import leetcode.problems.common.TreeNode;

public class Solution {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        return helper(root, sum, 0);
    }

    private boolean helper(TreeNode node, int target, int total) {
        if (node == null) {
            return false;
        }

        if (total > 0 && node.val > 0 && Integer.MAX_VALUE - node.val < total) {
            return false;
        } else if (total < 0 && node.val < 0 && Integer.MIN_VALUE - node.val > total) {
            return false;
        }

        total += node.val;

        if (node.left == null && node.right == null) {
            return total == target;
        }

        return helper(node.left, target, total) || helper(node.right, target, total);
    }
}
