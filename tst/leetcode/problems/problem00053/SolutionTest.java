package leetcode.problems.problem00053;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;

public class SolutionTest extends TestBase {

    private ConciseSolution solution;

    @Before
    public void before() {
        solution = new ConciseSolution();
    }

    @Test
    public void test1() {
        assertEquals(6, solution.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
    }

    @Test
    public void test2() {
        assertEquals(21, solution.maxSubArray(new int[] { 8, -19, 5, -4, 20 }));
    }

    @Test
    public void test3() {
        assertEquals(-1, solution.maxSubArray(new int[] { -1 }));
    }

    @Test
    public void test4() {
        assertEquals(0, solution.maxSubArray(null));
    }

    @Test
    public void test5() {
        assertEquals(0, solution.maxSubArray(new int[] {}));
    }
}
