package leetcode.problems.problem00236;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;
import leetcode.problems.common.TreeNode;

public class SolutionTest extends TestBase {

    private Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertNull(solution.lowestCommonAncestor(null, null, null));
    }

    @Test
    public void test2() {
        TreeNode node0 = new TreeNode(0);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);

        TreeNode root = node6;

        node6.left = node2;
        node6.right = node8;

        node2.left = node0;
        node2.right = node4;

        node8.left = node7;
        node8.right = node9;

        node4.left = node3;
        node4.right = node5;

        assertEquals(node6, solution.lowestCommonAncestor(root, node2, node8));
        assertEquals(node6, solution.lowestCommonAncestor(root, node8, node6));

        assertEquals(node2, solution.lowestCommonAncestor(root, node2, node4));
        assertEquals(node2, solution.lowestCommonAncestor(root, node4, node2));
    }

    @Test
    public void test3() {
        TreeNode node0 = new TreeNode(0);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);

        TreeNode root = node3;

        node3.left = node5;
        node3.right = node1;

        node5.left = node6;
        node5.right = node2;

        node1.left = node0;
        node1.right = node8;

        node2.left = node7;
        node2.right = node4;

        assertEquals(node3, solution.lowestCommonAncestor(root, node5, node1));
        assertEquals(node3, solution.lowestCommonAncestor(root, node1, node5));

        assertEquals(node5, solution.lowestCommonAncestor(root, node5, node4));
        assertEquals(node5, solution.lowestCommonAncestor(root, node4, node5));
    }
}
