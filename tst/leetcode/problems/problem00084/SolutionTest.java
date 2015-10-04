package leetcode.problems.problem00084;

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
        assertEquals(0, solution.largestRectangleArea(null));
    }

    @Test
    public void test2() {
        assertEquals(0, solution.largestRectangleArea(new int[] {}));
    }

    @Test
    public void test3() {
        assertEquals(1, solution.largestRectangleArea(new int[] { 1 }));
    }

    @Test
    public void test4() {
        assertEquals(10, solution.largestRectangleArea(new int[] { 2, 1, 5, 6, 2, 3 }));
    }

    @Test
    public void test5() {
        assertEquals(2, solution.largestRectangleArea(new int[] { 1, 1 }));
    }
}
