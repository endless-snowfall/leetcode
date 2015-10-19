package leetcode.problems.problem00172;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    private Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertEquals(0, solution.trailingZeroes(1));
    }

    @Test
    public void test2() {
        assertEquals(0, solution.trailingZeroes(4));
    }

    @Test
    public void test3() {
        assertEquals(1, solution.trailingZeroes(5));
    }

    @Test
    public void test4() {
        assertEquals(1, solution.trailingZeroes(9));
    }

    @Test
    public void test5() {
        assertEquals(2, solution.trailingZeroes(10));
    }

    @Test
    public void test6() {
        assertEquals(2, solution.trailingZeroes(14));
    }

    @Test
    public void test7() {
        assertEquals(3, solution.trailingZeroes(15));
    }

    @Test
    public void test8() {
        assertEquals(4, solution.trailingZeroes(20));
    }

    @Test
    public void test9() {
        assertEquals(6, solution.trailingZeroes(25));
    }

    @Test
    public void test10() {
        assertEquals(6, solution.trailingZeroes(25));
    }

    @Test
    public void test11() {
        assertEquals(7, solution.trailingZeroes(30));
    }

    @Test
    public void test12() {
        assertEquals(8, solution.trailingZeroes(35));
    }

    @Test
    public void test13() {
        assertEquals(9, solution.trailingZeroes(40));
    }

    @Test
    public void test14() {
        assertEquals(10, solution.trailingZeroes(45));
    }

    @Test
    public void test15() {
        assertEquals(12, solution.trailingZeroes(50));
    }

    @Test
    public void test16() {
        assertEquals(13, solution.trailingZeroes(55));
    }

    @Test
    public void test17() {
        assertEquals(14, solution.trailingZeroes(60));
    }

    @Test
    public void test18() {
        assertEquals(24, solution.trailingZeroes(100));
    }

    @Test
    public void test19() {
        assertEquals(25, solution.trailingZeroes(105));
    }

    @Test
    public void test20() {
        assertEquals(26, solution.trailingZeroes(110));
    }

    @Test
    public void test21() {
        assertEquals(27, solution.trailingZeroes(115));
    }

    @Test
    public void test22() {
        assertEquals(28, solution.trailingZeroes(120));
    }

    @Test
    public void test() {
        assertEquals(31, solution.trailingZeroes(125));
    }
}
