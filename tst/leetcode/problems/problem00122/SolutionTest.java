package leetcode.problems.problem00122;

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
        assertEquals(0, solution.maxProfit(null));
    }

    @Test
    public void test2() {
        assertEquals(0, solution.maxProfit(new int[] {}));
    }

    @Test
    public void test3() {
        assertEquals(0, solution.maxProfit(new int[] { 1 }));
    }

    @Test
    public void test4() {
        assertEquals(0, solution.maxProfit(new int[] { 1, 1 }));
    }

    @Test
    public void test5() {
        assertEquals(1, solution.maxProfit(new int[] { 1, 2 }));
    }

    @Test
    public void test6() {
        assertEquals(0, solution.maxProfit(new int[] { 2, 1 }));
    }

    @Test
    public void test7() {
        assertEquals(12, solution.maxProfit(new int[] { 4, 3, 7, 1, 5, 9 }));
    }

    @Test
    public void test8() {
        assertEquals(2, solution.maxProfit(new int[] { 2, 4, 1 }));
    }

    @Test
    public void test9() {
        assertEquals(7, solution.maxProfit(new int[] { 6, 1, 3, 2, 4, 7 }));
    }
}
