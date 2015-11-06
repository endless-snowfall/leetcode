package leetcode.problems.problem00230;

import static leetcode.problems.common.TestUtils.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;
import leetcode.problems.common.TreeNode;

public class SolutionTest extends TestBase {

    private static final TreeNode TREE = createTree(10, 5, 15, 1, 7, 13, 20, null, null, null, null, 11, 14, null, null);

    private ConciseSolution solution;

    @Before
    public void before() {
        solution = new ConciseSolution();
    }

    @Test
    public void test1() {
        assertEquals(1, solution.kthSmallest(TREE, 1));
    }

    @Test
    public void test2() {
        assertEquals(5, solution.kthSmallest(TREE, 2));
    }

    @Test
    public void test3() {
        assertEquals(7, solution.kthSmallest(TREE, 3));
    }

    @Test
    public void test4() {
        assertEquals(10, solution.kthSmallest(TREE, 4));
    }

    @Test
    public void test5() {
        assertEquals(11, solution.kthSmallest(TREE, 5));
    }

    @Test
    public void test6() {
        assertEquals(13, solution.kthSmallest(TREE, 6));
    }

    @Test
    public void test7() {
        assertEquals(14, solution.kthSmallest(TREE, 7));
    }

    @Test
    public void test8() {
        assertEquals(15, solution.kthSmallest(TREE, 8));
    }

    @Test
    public void test9() {
        assertEquals(20, solution.kthSmallest(TREE, 9));
    }

    @Test
    public void test10() {
        assertEquals(1, solution.kthSmallest(createTree(1), 1));
    }
}
