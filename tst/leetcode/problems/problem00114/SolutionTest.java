package leetcode.problems.problem00114;

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
        TreeNode input = null;
        solution.flatten(input);
        assertNull(input);
        assertTreesEquals(createTree((Integer) null), input);
    }

    @Test
    public void test2() {
        TreeNode input = createTree(1);
        solution.flatten(input);
        assertTreesEquals(createTree(1, null, null), input);
    }

    @Test
    public void test3() {
        TreeNode input = createTree(1, null, 3, null, null, null, null);
        solution.flatten(input);
        assertTreesEquals(createTree(1, null, 3, null, null, null, null), input);
    }

    @Test
    public void test4() {
        TreeNode input = createTree(1, 2, 3, null, null, null, null);
        solution.flatten(input);
        assertTreesEquals(createTree(1, null, 2, null, null, null, 3, null, null), input);
    }

    @Test
    public void test10() {
        TreeNode input = createTree(1, 2, 5, 3, 4, null, 6, null, null);
        solution.flatten(input);

        TreeNode expected = createTree(
            1,
            null, 2,
            null, null, null, 3,
            null, null, null, null, null, null, null, 4,
            null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 5,
            null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 6,
            null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);

        assertTreesEquals(expected, input);
    }

}
