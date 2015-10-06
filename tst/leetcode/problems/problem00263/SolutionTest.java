package leetcode.problems.problem00263;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;

public class SolutionTest extends TestBase {

    private BetterSolution solution;

    @Before
    public void before() {
        solution = new BetterSolution();
    }

    @Test
    public void test1() {
        assertFalse(solution.isUgly(-1));
    }

    @Test
    public void test2() {
        assertFalse(solution.isUgly(0));
    }

    @Test
    public void test3() {
        assertTrue(solution.isUgly(1));
    }

    @Test
    public void test4() {
        assertTrue(solution.isUgly(2));
    }

    @Test
    public void test5() {
        assertTrue(solution.isUgly(3));
    }

    @Test
    public void test6() {
        assertTrue(solution.isUgly(5));
    }

    @Test
    public void test7() {
        assertTrue(solution.isUgly(15));
    }

    @Test
    public void test8() {
        assertFalse(solution.isUgly(14));
    }
}
