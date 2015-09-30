package leetcode.problems.problem00100;

import leetcode.problems.common.TreeNode;

public class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p != null && q == null) {
            return false;
        } else if (p == null && q != null) {
            return false;
        }

        return (p.val != q.val)
            ? false
            : isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
