package leetcode.problems.problem00094;

import java.util.ArrayList;
import java.util.List;

import leetcode.problems.common.TreeNode;

public class RecursiveSolution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        inorderTraversalRecursive(result, root);
        return result;
    }

    private void inorderTraversalRecursive(List<Integer> result, TreeNode node) {
        if (node == null) {
            return;
        }

        inorderTraversalRecursive(result, node.left);
        result.add(node.val);
        inorderTraversalRecursive(result, node.right);
    }
}
