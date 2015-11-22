package leetcode.problems.problem00145;

import java.util.ArrayList;
import java.util.List;

import leetcode.problems.common.TreeNode;

public class Solution {

    public List<Integer> postorderTraversal(TreeNode root) {
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

        helper(node.left, result);
        helper(node.right, result);
        result.add(node.val);
    }
}
