package leetcode.problems.problem00029;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;

public class SolutionTest extends TestBase {

    private FasterSolution solution;

    @Before
    public void before() {
        solution = new FasterSolution();
    }

    @Test
    public void test1() {
        assertEquals(100, solution.divide(100, 1));
    }

    @Test
    public void test2() {
        assertEquals(-100, solution.divide(100, -1));
    }

    @Test
    public void test3() {
        assertEquals(Integer.MAX_VALUE, solution.divide(Integer.MIN_VALUE, -1));
    }

    @Test
    public void test4() {
        assertEquals(Integer.MAX_VALUE * -1, solution.divide(Integer.MAX_VALUE, -1));
    }

    @Test
    public void test5() {
        assertEquals(0, solution.divide(0, 100));
    }

    @Test
    public void test6() {
        assertEquals(9, solution.divide(99, 11));
    }

    @Test
    public void test7() {
        assertEquals(-9, solution.divide(99, -11));
    }

    @Test
    public void test8() {
        assertEquals(-9, solution.divide(-99, 11));
    }

    @Test
    public void test9() {
        assertEquals(9, solution.divide(-99, -11));
    }

    @Test
    public void test10() {
        assertEquals(536870912, solution.divide(1073741824, 2));
    }

    @Test
    public void test11() {
        assertEquals(Integer.MIN_VALUE / 2 * -1, solution.divide(Integer.MIN_VALUE, -2));
    }

    @Test
    public void test12() {
        assertEquals(0, solution.divide(1, 2));
    }

    @Test
    public void test13() {
        assertEquals(1073741823, solution.divide(Integer.MAX_VALUE, 2));
    }

    @Test
    public void test14() {
        assertEquals(1073741824, solution.divide(Integer.MIN_VALUE, -2));
    }
}
