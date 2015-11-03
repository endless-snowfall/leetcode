package leetcode.problems.problem00152;

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
        assertEquals(6, solution.maxProduct(new int[] { 2, 3, -2, 4 }));
    }

    @Test
    public void test2() {
        assertEquals(0, solution.maxProduct(null));
    }

    @Test
    public void test3() {
        assertEquals(0, solution.maxProduct(new int[] {}));
    }

    @Test
    public void test4() {
        assertEquals(-1, solution.maxProduct(new int[] { -1 }));
    }

    @Test
    public void test5() {
        assertEquals(1, solution.maxProduct(new int[] { -1, -1 }));
    }

    @Test
    public void test6() {
        assertEquals(0, solution.maxProduct(new int[] { 0 }));
    }

    @Test
    public void test7() {
        assertEquals(5, solution.maxProduct(new int[] { 0, 5 }));
    }

    @Test
    public void test8() {
        assertEquals(5, solution.maxProduct(new int[] { 5, 0 }));
    }

    @Test
    public void test9() {
        assertEquals(5, solution.maxProduct(new int[] { 0, 5, 0 }));
    }

    @Test
    public void test10() {
        assertEquals(30, solution.maxProduct(new int[] { 2, 3, 5 }));
    }

    @Test
    public void test11() {
        assertEquals(30, solution.maxProduct(new int[] { 0, 2, 3, 5, 0 }));
    }

    @Test
    public void test12() {
        assertEquals(210, solution.maxProduct(new int[] { -1, 2, 3, 5, -7 }));
    }

    @Test
    public void test13() {
        assertEquals(0, solution.maxProduct(new int[] { -2, 0, -1 }));
    }

    @Test
    public void test14() {
        assertEquals(4, solution.maxProduct(new int[] { 3, -1, 4 }));
    }

    @Test
    public void test15() {
        assertEquals(1, solution.maxProduct(new int[] { 0, -3, 1, 1 }));
    }
}
