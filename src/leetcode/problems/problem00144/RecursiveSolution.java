package leetcode.problems.problem00144;

import java.util.ArrayList;
import java.util.List;

import leetcode.problems.common.TreeNode;

public class RecursiveSolution {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        helper(root, result);
        return result;
    }

    private void helper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        result.add(node.val);
        helper(node.left, result);
        helper(node.right, result);
    }
}
