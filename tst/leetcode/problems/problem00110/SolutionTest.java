package leetcode.problems.problem00110;

import static leetcode.problems.common.TestUtils.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;

public class SolutionTest extends TestBase {

    private Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertTrue(solution.isBalanced(null));
    }

    @Test
    public void test2() {
        assertTrue(solution.isBalanced(createTree(1)));
    }

    @Test
    public void test3() {
        assertTrue(solution.isBalanced(createTree(1, 2, 2)));
    }

    @Test
    public void test4() {
        assertTrue(solution.isBalanced(createTree(1, null, 2)));
    }

    @Test
    public void test5() {
        assertTrue(solution.isBalanced(createTree(1, 2, null)));
    }

    @Test
    public void test6() {
        assertFalse(solution.isBalanced(createTree(1, 2, null, 3, null)));
    }

    @Test
    public void test7() {
        assertFalse(solution.isBalanced(createTree(1, 2, null, null, 3)));
    }
}
