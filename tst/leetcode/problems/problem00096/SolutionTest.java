package leetcode.problems.problem00096;

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
    public void test0a() {
        assertEquals(0, solution.numTrees(-1));
    }

    @Test
    public void test0b() {
        assertEquals(0, solution.numTrees(0));
    }

    @Test
    public void test1() {
        assertEquals(1, solution.numTrees(1));
    }

    @Test
    public void test3() {
        assertEquals(5, solution.numTrees(3));
    }

    @Test
    public void test19() {
        assertEquals(1767263190, solution.numTrees(19));
    }
}
