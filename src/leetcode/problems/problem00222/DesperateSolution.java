package leetcode.problems.problem00222;

import leetcode.problems.common.TreeNode;

public class DesperateSolution {

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftBranchDepth = getBranchDepth(root);
        if (isPerfectTree(root)) {
            return countNodesForDepth(leftBranchDepth);
        }

        int result = countNodesForDepth(leftBranchDepth - 1);
        result += getNumNodesOnLastLevel(root, leftBranchDepth);
        return result;
    }

    private int getNumNodesOnLastLevel(TreeNode node, int targetDepth) {
        int leftBranchDepth = getBranchDepth(node);

        if (leftBranchDepth < targetDepth) {
            return 0;
        }

        return (isPerfectTree(node.left))
            ? (1 << (leftBranchDepth - 1)) + getNumNodesOnLastLevel(node.right, targetDepth - 1)
            : getNumNodesOnLastLevel(node.left, targetDepth - 1);
    }

    private boolean isPerfectTree(TreeNode node) {
        return (getBranchDepth(node) == getRightBranchDepth(node));
    }

    private int countNodesForDepth(int depth) {
        int result = 0;
        int nodesForLevel = 1;
        for (int i = 0; i <= depth; i++) {
            result += nodesForLevel;
            nodesForLevel = nodesForLevel << 1;
        }
        return result;
    }

    private int getBranchDepth(TreeNode node) {
        int result = -1;
        while (node != null) {
            result++;
            node = node.left;
        }
        return result;
    }

    private int getRightBranchDepth(TreeNode node) {
        int result = -1;
        while (node != null) {
            result++;
            node = node.right;
        }
        return result;
    }
}
