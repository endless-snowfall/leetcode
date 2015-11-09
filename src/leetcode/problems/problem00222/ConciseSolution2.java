package leetcode.problems.problem00222;

import leetcode.problems.common.TreeNode;

public class ConciseSolution2 {

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftBranchDepth = getLeftBranchDepth(root);
        int result = countNodesForDepth(leftBranchDepth - 1);
        result += getNumNodesOnLastLevel(root, leftBranchDepth);
        return result;
    }

    private int getNumNodesOnLastLevel(TreeNode node, int targetDepth) {
        int leftBranchDepth = getLeftBranchDepth(node);

        if (leftBranchDepth < targetDepth) {
            return 0;
        } else if (targetDepth == 0) {
            return 1;
        }

        return (isPerfectTree(node.left, leftBranchDepth - 1))
            ? (1 << (leftBranchDepth - 1)) + getNumNodesOnLastLevel(node.right, targetDepth - 1)
            : getNumNodesOnLastLevel(node.left, targetDepth - 1);
    }

    private boolean isPerfectTree(TreeNode node, int leftBranchDepth) {
        return (leftBranchDepth == getRightBranchDepth(node));
    }

    private int countNodesForDepth(int depth) {
        return (1 << (depth + 1)) - 1;
    }

    private int getLeftBranchDepth(TreeNode node) {
        return (node == null) ? -1 : 1 + getLeftBranchDepth(node.left);
    }

    private int getRightBranchDepth(TreeNode node) {
        return (node == null) ? -1 : 1 + getRightBranchDepth(node.right);
    }
}
