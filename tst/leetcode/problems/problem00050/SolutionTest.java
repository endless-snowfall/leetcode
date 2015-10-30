package leetcode.problems.problem00050;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;

public class SolutionTest extends TestBase {

    private static final double EPSILON = 0.00000001;
    private Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertEquals(0, solution.myPow(0, 0), EPSILON);
    }

    @Test
    public void test2() {
        assertEquals(0, solution.myPow(0, 1), EPSILON);
    }

    @Test
    public void test3() {
        assertEquals(1, solution.myPow(2, 0), EPSILON);
    }

    @Test
    public void test4() {
        assertEquals(2, solution.myPow(2, 1), EPSILON);
    }

    @Test
    public void test5() {
        assertEquals(4, solution.myPow(2, 2), EPSILON);
    }

    @Test
    public void test6() {
        assertEquals(8, solution.myPow(2, 3), EPSILON);
    }

    @Test
    public void test7() {
        assertEquals(16, solution.myPow(2, 4), EPSILON);
    }

    @Test
    public void test8() {
        assertEquals(1, solution.myPow(3, 0), EPSILON);
    }

    @Test
    public void test9() {
        assertEquals(3, solution.myPow(3, 1), EPSILON);
    }

    @Test
    public void test10() {
        assertEquals(9, solution.myPow(3, 2), EPSILON);
    }

    @Test
    public void test11() {
        assertEquals(27, solution.myPow(3, 3), EPSILON);
    }

    @Test
    public void test12() {
        assertEquals(81, solution.myPow(3, 4), EPSILON);
    }

    @Test
    public void test13() {
        assertEquals(1, solution.myPow(2, -0), EPSILON);
    }

    @Test
    public void test14() {
        assertEquals(1 / 2.0, solution.myPow(2, -1), EPSILON);
    }

    @Test
    public void test15() {
        assertEquals(1 / 4.0, solution.myPow(2, -2), EPSILON);
    }

    @Test
    public void test16() {
        assertEquals(1 / 8.0, solution.myPow(2, -3), EPSILON);
    }

    @Test
    public void test17() {
        assertEquals(1 / 16.0, solution.myPow(2, -4), EPSILON);
    }

    @Test
    public void test18() {
        assertEquals(1, solution.myPow(-2, 0), EPSILON);
    }

    @Test
    public void test19() {
        assertEquals(-2, solution.myPow(-2, 1), EPSILON);
    }

    @Test
    public void test20() {
        assertEquals(4, solution.myPow(-2, 2), EPSILON);
    }

    @Test
    public void test21() {
        assertEquals(-8, solution.myPow(-2, 3), EPSILON);
    }

    @Test
    public void test22() {
        assertEquals(16, solution.myPow(2, 4), EPSILON);
    }

    @Test
    public void test23() {
        assertEquals(-32, solution.myPow(-2, 5), EPSILON);
    }
}
