package leetcode.problems.problem00101;

import leetcode.problems.common.TreeNode;

public class Solution1 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isSymmetricHelper(root.left, root.right);
    }

    private boolean isSymmetricHelper(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) {
            return true;
        } else if (n1 == null && n2 != null) {
            return false;
        } else if (n1 != null && n2 == null) {
            return false;
        }

        if (n1.val != n2.val) {
            return false;
        }

        return (isSymmetricHelper(n1.left, n2.right) && isSymmetricHelper(n1.right, n2.left));
    }
}
