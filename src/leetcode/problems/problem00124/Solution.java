package leetcode.problems.problem00124;

import leetcode.problems.common.TreeNode;

public class Solution {

    public static class Result {

        public int rootedMax;
        public int pathMax;

        public Result(int rootedMax, int pathMax) {
            this.rootedMax = rootedMax;
            this.pathMax = pathMax;
        }
    }

    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Result result = helper(root);
        return max(root.val, result.rootedMax, result.pathMax);
    }

    private Result helper(TreeNode node) {
        if (node == null) {
            return new Result(Integer.MIN_VALUE, Integer.MIN_VALUE);
        }

        Result left = helper(node.left);
        Result right = helper(node.right);

        Result result = new Result(
            max(
                left.rootedMax,
                right.rootedMax,
                max(
                    node.val,
                    add(node.val, left.pathMax),
                    add(node.val, right.pathMax),
                    add(node.val, add(left.pathMax, right.pathMax)))),
            max(
                node.val,
                add(node.val, left.pathMax),
                add(node.val, right.pathMax)));

        return result;
    }

    private int max(int x, int y, int z) {
        return Math.max(Math.max(x, y), z);
    }

    private int max(int w, int x, int y, int z) {
        return Math.max(Math.max(w, x), Math.max(y, z));
    }

    private int add(int x, int y) {
        if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return x + y;
    }
}
