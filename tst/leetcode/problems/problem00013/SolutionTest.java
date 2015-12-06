package leetcode.problems.problem00013;

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
        assertEquals(1, solution.romanToInt("I"));
    }

    @Test
    public void test4() {
        assertEquals(4, solution.romanToInt("IV"));
    }

    @Test
    public void test5() {
        assertEquals(5, solution.romanToInt("V"));
    }

    @Test
    public void test9() {
        assertEquals(9, solution.romanToInt("IX"));
    }

    @Test
    public void test10() {
        assertEquals(10, solution.romanToInt("X"));
    }

    @Test
    public void test40() {
        assertEquals(40, solution.romanToInt("XL"));
    }

    @Test
    public void test50() {
        assertEquals(50, solution.romanToInt("L"));
    }

    @Test
    public void test90() {
        assertEquals(90, solution.romanToInt("XC"));
    }

    @Test
    public void test400() {
        assertEquals(400, solution.romanToInt("CD"));
    }

    @Test
    public void test500() {
        assertEquals(500, solution.romanToInt("D"));
    }

    @Test
    public void test900() {
        assertEquals(900, solution.romanToInt("CM"));
    }

    @Test
    public void test1000() {
        assertEquals(1000, solution.romanToInt("M"));
    }

    @Test
    public void test2011() {
        assertEquals(2011, solution.romanToInt("MMXI"));
    }
}
