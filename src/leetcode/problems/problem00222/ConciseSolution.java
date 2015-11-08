package leetcode.problems.problem00222;

import leetcode.problems.common.TreeNode;

public class ConciseSolution {

    public int countNodes(TreeNode root) {
        int result = 0;

        if (root == null) {
            return result;
        } else if (root.left == null && root.right == null) {
            return 1;
        }

        int leftBranchDepth = getBranchDepth(root);
        int targetDepth = leftBranchDepth - 1;
        result = countNodes(result, targetDepth);
        result += countNodesBinarySearch(root, targetDepth);
        return result;
    }

    private int countNodes(int result, int depth) {
        int nodesForLevel = 1;
        for (int i = 0; i <= depth; i++) {
            result += nodesForLevel;
            nodesForLevel = nodesForLevel << 1;
        }
        return result;
    }

    private int getBranchDepth(TreeNode node) {
        int result = -1;
        while (node != null) {
            result++;
            node = node.left;
        }
        return result;
    }

    private int countNodesBinarySearch(TreeNode root, int targetDepth) {
        int leftEdge = 0;
        int start = 1;
        int end = 1 << targetDepth;
        int rightEdge = end + 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int numChildren = getNumberOfChildren(mid, root, targetDepth, mid);

            if (numChildren == 2) {
                if (rightEdge == mid + 1) {
                    return mid * 2;
                }
                start = mid + 1;
                leftEdge = mid;
                root = root.right;
            } else if (numChildren == 1) {
                return (2 * (mid - 1)) + 1;
            } else {
                if (leftEdge == mid - 1) {
                    return (mid - 1) * 2;
                }
                end = mid - 1;
                rightEdge = mid;
                root = root.left;
            }

            targetDepth--;
        }

        return -1;
    }

    private int getNumberOfChildren(int number, TreeNode node, int targetDepth, int mid) {
        int depth = 0;

        while (depth <= targetDepth) {
            if (depth == targetDepth) {
                if (node.left == null && node.right == null) {
                    return 0;
                } else if (node.left != null && node.right == null) {
                    return 1;
                } else {
                    return 2;
                }
            }

            if (number <= mid) {
                node = node.left;
                mid = mid - (mid / 2);
            } else {
                node = node.right;
                mid = mid + (mid / 2);
            }

            depth++;
        }

        return 2;
    }
}
