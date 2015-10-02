package leetcode.problems.problem00173;

import java.util.Stack;

import leetcode.problems.common.TreeNode;

public class BSTIterator {

    Stack<TreeNode> stack = new Stack<>();
    Integer next;

    public BSTIterator(TreeNode root) {
        if (root != null) {
            stack.push(root);
            next = findNext();
        }
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return next != null;
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        int result = next.intValue();
        next = findNext();
        return result;
    }

    private Integer findNext() {
        if (stack.isEmpty()) {
            return null;
        }

        TreeNode top = stack.peek();

        if (top.left != null) {
            TreeNode left = top.left;
            top.left = null;
            stack.push(left);
            return findNext();
        }

        int result = stack.pop().val;

        if (top.right != null) {
            TreeNode right = top.right;
            top.right = null;
            stack.push(right);
        }

        return result;
    }
}

/**
 * Your BSTIterator will be called like this: BSTIterator i = new
 * BSTIterator(root); while (i.hasNext()) v[f()] = i.next();
 */
