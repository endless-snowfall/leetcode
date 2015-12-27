package leetcode.problems.problem00113;

import java.util.ArrayList;
import java.util.List;

import leetcode.problems.common.TreeNode;

public class Solution {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        helper(root, sum, result, new ArrayList<>());
        return result;
    }

    private void helper(TreeNode root, int sum, List<List<Integer>> result, List<Integer> candidate) {
        if (root.left == null && root.right == null) {
            if (root.val == sum) {
                List<Integer> newResult = new ArrayList<>();
                newResult.addAll(candidate);
                newResult.add(root.val);
                result.add(newResult);
            }
            return;
        }

        candidate.add(root.val);

        if (root.left != null) {
            helper(root.left, sum - root.val, result, candidate);
        }

        if (root.right != null) {
            helper(root.right, sum - root.val, result, candidate);
        }

        candidate.remove(candidate.size() - 1);
    }
}
