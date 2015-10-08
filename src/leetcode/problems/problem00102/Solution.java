package leetcode.problems.problem00102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import leetcode.problems.common.TreeNode;

public class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        helper(result, queue);

        return result;
    }

    private void helper(List<List<Integer>> result, Queue<TreeNode> queue) {
        if (queue.isEmpty()) {
            return;
        }

        List<Integer> list = new ArrayList<>();
        int queueSize = queue.size();

        for (int i = 0; i < queueSize; i++) {
            TreeNode node = queue.remove();
            list.add(node.val);

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }

        if (!list.isEmpty()) {
            result.add(list);
        }

        helper(result, queue);
    }
}
