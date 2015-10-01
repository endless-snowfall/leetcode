package leetcode.problems.problem00104;

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
        assertEquals(0, solution.maxDepth(null));
    }

    @Test
    public void test2() {
        assertEquals(1, solution.maxDepth(createTree(1)));
    }

    @Test
    public void test3() {
        assertEquals(2, solution.maxDepth(createTree(1, 2, 2)));
    }

    @Test
    public void test4() {
        assertEquals(2, solution.maxDepth(createTree(1, null, 2)));
    }

    @Test
    public void test5() {
        assertEquals(2, solution.maxDepth(createTree(1, 2, null)));
    }

    @Test
    public void test6() {
        assertEquals(3, solution.maxDepth(createTree(1, 2, null, 3, null)));
    }
}
