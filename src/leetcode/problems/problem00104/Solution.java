package leetcode.problems.problem00104;

import leetcode.problems.common.TreeNode;

public class Solution {

    public int maxDepth(TreeNode root) {
        return (root == null)
            ? 0
            : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
