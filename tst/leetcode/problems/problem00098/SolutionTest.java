package leetcode.problems.problem00098;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;
import leetcode.problems.common.TestUtils;

public class SolutionTest extends TestBase {

    private Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertTrue(solution.isValidBST(null));
    }

    @Test
    public void test2() {
        assertTrue(solution.isValidBST(TestUtils.createTree(1)));
    }

    @Test
    public void test3() {
        assertTrue(solution.isValidBST(TestUtils.createTree(2, 1, 3)));
    }

    @Test
    public void test4() {
        assertFalse(solution.isValidBST(TestUtils.createTree(1, 2, null)));
    }

    @Test
    public void test5() {
        assertFalse(solution.isValidBST(TestUtils.createTree(2, 1, 0)));
    }

    @Test
    public void test6() {
        assertFalse(solution.isValidBST(TestUtils.createTree(-2147483648, -2147483648)));
    }
}
