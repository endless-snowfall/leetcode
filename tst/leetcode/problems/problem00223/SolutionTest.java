package leetcode.problems.problem00223;

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
        assertEquals(45, solution.computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
    }

    @Test
    public void test2() {
        assertEquals(51, solution.computeArea(-3, 0, 3, 4, 4, -1, 13, 2));
    }

    @Test
    public void test3() {
        assertEquals(51, solution.computeArea(10, 0, 16, 4, 0, -1, 9, 2));
    }

    @Test
    public void test4() {
        assertEquals(51, solution.computeArea(-3, 5, 3, 9, 0, -1, 9, 2));
    }

    @Test
    public void test5() {
        assertEquals(51, solution.computeArea(-3, 0, 3, 4, 0, 4, 9, 7));
    }
}
