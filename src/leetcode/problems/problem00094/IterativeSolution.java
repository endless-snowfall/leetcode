package leetcode.problems.problem00094;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import leetcode.problems.common.TreeNode;

public class IterativeSolution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        inorderTraversalIterative(result, stack);
        return result;
    }

    private void inorderTraversalIterative(List<Integer> result, Stack<TreeNode> stack) {
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();

            if (node.left == null && node.right == null) {
                result.add(node.val);
                continue;
            }

            if (node.right != null) {
                stack.push(node.right);
                node.right = null;
            }

            stack.push(node);

            if (node.left != null) {
                stack.push(node.left);
                node.left = null;
            }
        }
    }
}
