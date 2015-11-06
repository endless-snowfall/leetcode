package leetcode.problems.problem00230;

import leetcode.problems.common.TreeNode;

public class ConciseSolution {

    public int kthSmallest(TreeNode root, int k) {
        Result result = new Result();
        result.desiredRank = k;

        inOrderTraversal(root, result);
        return result.resultValue;
    }

    private void inOrderTraversal(TreeNode node, Result result) {
        if (node.left != null) {
            inOrderTraversal(node.left, result);
        }

        result.rank = result.rank + 1;

        if (result.rank == result.desiredRank) {
            result.resultValue = node.val;
            return;
        }

        if (node.right != null) {
            inOrderTraversal(node.right, result);
        }
    }
}

class Result {

    int rank;
    int desiredRank;
    int resultValue;
}
