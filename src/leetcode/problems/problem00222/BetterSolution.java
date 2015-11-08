package leetcode.problems.problem00222;

import leetcode.problems.common.TreeNode;

public class BetterSolution {

    public int countNodes(TreeNode root) {
        int result = 0;

        if (root == null) {
            return result;
        }

        int leftBranchDepth = getBranchDepth(root, true);
        int rightBranchDepth = getBranchDepth(root, false);

        result = countNodes(result, leftBranchDepth - 1);

        if (leftBranchDepth == rightBranchDepth) {
            result += Math.pow(2, leftBranchDepth);
            return result;
        }

        result += countNodesBinarySearch(root, leftBranchDepth - 1);
        return result;
    }

    private int countNodes(int result, int depth) {
        for (int i = 0; i <= depth; i++) {
            result += Math.pow(2, i);
        }
        return result;
    }

    private int getBranchDepth(TreeNode node, boolean goLeft) {
        int result = -1;

        while (node != null) {
            result++;
            node = (goLeft) ? node.left : node.right;
        }

        return result;
    }

    private int countNodesBinarySearch(TreeNode root, int targetDepth) {
        int start = 1;
        int end = (int) Math.pow(2, targetDepth);

        int leftEdge = 0;
        int rightEdge = end + 1;

        while (start <= end) {
            int mid = ((end - start) / 2) + start;
            int numChildren = getNumberOfChildren(mid, root, targetDepth);

            if (numChildren == 2) {
                if (rightEdge == mid + 1) {
                    return mid * 2;
                }
                start = mid + 1;
                leftEdge = mid;
            } else if (numChildren == 1) {
                return (2 * (mid - 1)) + 1;
            } else {
                if (leftEdge == mid - 1) {
                    return (mid - 1) * 2;
                }
                end = mid - 1;
                rightEdge = mid;
            }
        }

        return -1;
    }

    private int getNumberOfChildren(int number, TreeNode node, int targetDepth) {
        int mid = (int) Math.pow(2, targetDepth) / 2;
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
