package leetcode.problems.problem00222;

import leetcode.problems.common.TreeNode;

public class Solution {

    public int countNodes(TreeNode root) {
        int result = 0;

        if (root == null) {
            return result;
        }

        int leftBranchDepth = getBranchDepth(root, true);
        int rightBranchDepth = getBranchDepth(root, false);

        int numNodesinLastLevel = (leftBranchDepth == rightBranchDepth)
            ? (int) Math.pow(2, leftBranchDepth)
            : countNodesInLastLevel(root, leftBranchDepth);

        result = countNodes(result, leftBranchDepth - 1);
        result += numNodesinLastLevel;
        return result;
    }

    private int countNodes(int result, int depth) {
        for (int i = 0; i <= depth; i++) {
            result += Math.pow(2, i);
        }
        return result;
    }

    private int getBranchDepth(TreeNode node, boolean goLeft) {
        int result = -1;

        while (node != null) {
            result++;
            node = (goLeft) ? node.left : node.right;
        }

        return result;
    }

    private int countNodesInLastLevel(TreeNode root, int leftBranchDepth) {
        Result result = new Result();
        helper(root, result, leftBranchDepth - 1, 0);
        return result.numNodesInLastLevel;
    }

    private void helper(TreeNode node, Result result, int targetLevel, int currentLevel) {
        if (currentLevel == targetLevel) {
            if (node.left != null && node.right != null) {
                result.numNodesInLastLevel = result.numNodesInLastLevel + 2;
            } else if (node.left != null && node.right == null) {
                result.numNodesInLastLevel = result.numNodesInLastLevel + 1;
                result.stop = true;
            } else {
                result.stop = true;
            }
            return;
        }

        if (result.stop) {
            return;
        }

        helper(node.left, result, targetLevel, currentLevel + 1);

        if (result.stop) {
            return;
        }

        helper(node.right, result, targetLevel, currentLevel + 1);
    }
}

class Result {

    int numNodesInLastLevel;
    boolean stop;
}
