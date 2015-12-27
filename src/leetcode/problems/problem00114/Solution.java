package leetcode.problems.problem00114;

import java.util.Stack;

import leetcode.problems.common.TreeNode;

public class Solution {

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode tail = null;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();

            if (tail != null) {
                tail.right = node;
            }

            if (node.right != null) {
                stack.push(node.right);
                node.right = null;
            }

            if (node.left != null) {
                stack.push(node.left);
                node.left = null;
            }

            tail = node;
        }
    }
}
