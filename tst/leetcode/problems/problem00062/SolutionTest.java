package leetcode.problems.problem00062;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;

public class SolutionTest extends TestBase {

    private DPSolution solution;

    @Before
    public void before() {
        solution = new DPSolution();
    }

    @Test
    public void test1() {
        assertEquals(0, solution.uniquePaths(0, 0));
    }

    @Test
    public void test2() {
        assertEquals(0, solution.uniquePaths(0, 1));
    }

    @Test
    public void test3() {
        assertEquals(0, solution.uniquePaths(1, 0));
    }

    @Test
    public void test4() {
        assertEquals(1, solution.uniquePaths(1, 1));
    }

    @Test
    public void test5() {
        assertEquals(1, solution.uniquePaths(1, 2));
    }

    @Test
    public void test6() {
        assertEquals(1, solution.uniquePaths(2, 1));
    }

    @Test
    public void test7() {
        assertEquals(3, solution.uniquePaths(2, 3));
    }

    @Test
    public void test8() {
        assertEquals(3, solution.uniquePaths(3, 2));
    }

    @Test
    public void test9() {
        assertEquals(4496388, solution.uniquePaths(36, 7));
    }

    @Test
    public void test10() {
        assertEquals(462, solution.uniquePaths(6, 7));
    }
}
