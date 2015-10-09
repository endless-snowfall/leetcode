package leetcode.problems.problem00235;

import leetcode.problems.common.TreeNode;

public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) {
            return null;
        } else if (root == p || root == q) {
            return root;
        }

        boolean pInLST = (p.val < root.val);
        boolean qInLST = (q.val < root.val);

        if (pInLST && qInLST) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (!pInLST && !qInLST) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }
}
