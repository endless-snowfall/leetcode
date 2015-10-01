package leetcode.problems.problem00101;

import java.util.LinkedList;
import java.util.Queue;

import leetcode.problems.common.TreeNode;

public class Solution2 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.add(root.left);
        queue2.add(root.right);

        return isSymmetricHelper(queue1, queue2);
    }

    private boolean isSymmetricHelper(Queue<TreeNode> q1, Queue<TreeNode> q2) {
        while (!q1.isEmpty()) {
            TreeNode q1Node = q1.remove();
            TreeNode q2Node = q2.remove();

            if (q1Node == null && q2Node == null) {
                continue;
            } else if (q1Node == null && q2Node != null) {
                return false;
            } else if (q1Node != null && q2Node == null) {
                return false;
            }

            if (q1Node.val != q2Node.val) {
                return false;
            }

            q1.add(q1Node.left);
            q1.add(q1Node.right);
            q2.add(q2Node.right);
            q2.add(q2Node.left);
        }

        return true;
    }
}
