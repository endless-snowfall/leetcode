package leetcode.problems.problem00070;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;

public class SolutionTest extends TestBase {

    private SolutionIterative solution;

    @Before
    public void before() {
        solution = new SolutionIterative();
    }

    @Test
    public void test1() {
        assertEquals(0, solution.climbStairs(-1));
    }

    @Test
    public void test2() {
        assertEquals(0, solution.climbStairs(0));
    }

    @Test
    public void test3() {
        assertEquals(1, solution.climbStairs(1));
    }

    @Test
    public void test4() {
        assertEquals(2, solution.climbStairs(2));
    }

    @Test
    public void test5() {
        assertEquals(3, solution.climbStairs(3));
    }

    @Test
    public void test6() {
        assertEquals(5, solution.climbStairs(4));
    }
}
