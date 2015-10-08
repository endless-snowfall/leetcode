package leetcode.problems.problem00111;

import java.util.LinkedList;
import java.util.Queue;

import leetcode.problems.common.TreeNode;

public class Solution {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        return helper(queue, 1);
    }

    private int helper(Queue<TreeNode> queue, int result) {
        if (queue.isEmpty()) {
            return result;
        }

        int queueSize = queue.size();
        for (int i = 0; i < queueSize; i++) {
            TreeNode node = queue.remove();
            if (node.left == null && node.right == null) {
                return result;
            }
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }

        return helper(queue, result + 1);
    }
}
