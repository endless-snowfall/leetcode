package leetcode.problems.problem00145;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import leetcode.problems.common.TreeNode;

public class IterativeSolution {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        helper(stack, result);
        return result;
    }

    private void helper(Stack<TreeNode> stack, List<Integer> result) {
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();

            if (node.left == null && node.right == null) {
                result.add(node.val);
                continue;
            }

            stack.push(node);

            if (node.right != null) {
                stack.push(node.right);
                node.right = null;
            }

            if (node.left != null) {
                stack.push(node.left);
                node.left = null;
            }
        }
    }
}
