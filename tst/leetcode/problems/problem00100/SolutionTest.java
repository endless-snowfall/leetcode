package leetcode.problems.problem00100;

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
        assertTrue(solution.isSameTree(null, null));
    }

    @Test
    public void test2() {
        assertFalse(solution.isSameTree(null, createTree(1)));
    }

    @Test
    public void test3() {
        assertTrue(solution.isSameTree(createTree(1), createTree(1)));
    }

    @Test
    public void test4() {
        assertFalse(solution.isSameTree(createTree(1), createTree(2)));
    }

    @Test
    public void test5() {
        assertFalse(solution.isSameTree(createTree(1, 2, 3), createTree(1, 3, 2)));
    }
}
