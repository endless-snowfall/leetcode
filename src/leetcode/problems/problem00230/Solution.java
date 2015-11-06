package leetcode.problems.problem00230;

import java.util.LinkedList;
import java.util.List;

import leetcode.problems.common.TreeNode;

public class Solution {

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> orderedValues = new LinkedList<>();
        inOrderTraversal(root, orderedValues);
        return orderedValues.get(k - 1);
    }

    private void inOrderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }

        inOrderTraversal(node.left, list);
        list.add(node.val);
        inOrderTraversal(node.right, list);
    }
}
