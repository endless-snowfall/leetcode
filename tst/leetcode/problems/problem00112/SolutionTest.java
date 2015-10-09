package leetcode.problems.problem00112;

import static leetcode.problems.common.TestUtils.*;
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
        assertFalse(solution.hasPathSum(null, 1));
    }

    @Test
    public void test2() {
        assertTrue(solution.hasPathSum(createTree(1), 1));
    }

    @Test
    public void test3() {
        assertFalse(solution.hasPathSum(createTree(1), 0));
    }

    @Test
    public void test4() {
        TreeNode tree = createTree(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, null, null, 1);

        assertTrue(solution.hasPathSum(tree, 27));
        assertTrue(solution.hasPathSum(tree, 22));
        assertTrue(solution.hasPathSum(tree, 26));
        assertTrue(solution.hasPathSum(tree, 18));

        assertFalse(solution.hasPathSum(tree, 20));
        assertFalse(solution.hasPathSum(tree, 9));
        assertFalse(solution.hasPathSum(tree, 5));

        assertFalse(solution.hasPathSum(tree, 13));

        assertFalse(solution.hasPathSum(tree, 17));
    }
}
