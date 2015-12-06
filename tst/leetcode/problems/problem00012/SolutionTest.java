package leetcode.problems.problem00012;

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
    public void test0a() {
        assertTrue(solution.integerToRoman(-1).isEmpty());
    }

    @Test
    public void test0b() {
        assertTrue(solution.integerToRoman(0).isEmpty());
    }

    @Test
    public void test1() {
        assertEquals("I", solution.integerToRoman(1));
    }

    @Test
    public void test4() {
        assertEquals("IV", solution.integerToRoman(4));
    }

    @Test
    public void test5() {
        assertEquals("V", solution.integerToRoman(5));
    }

    @Test
    public void test9() {
        assertEquals("IX", solution.integerToRoman(9));
    }

    @Test
    public void test10() {
        assertEquals("X", solution.integerToRoman(10));
    }

    @Test
    public void test40() {
        assertEquals("XL", solution.integerToRoman(40));
    }

    @Test
    public void test50() {
        assertEquals("L", solution.integerToRoman(50));
    }

    @Test
    public void test90() {
        assertEquals("XC", solution.integerToRoman(90));
    }

    @Test
    public void test400() {
        assertEquals("CD", solution.integerToRoman(400));
    }

    @Test
    public void test500() {
        assertEquals("D", solution.integerToRoman(500));
    }

    @Test
    public void test900() {
        assertEquals("CM", solution.integerToRoman(900));
    }

    @Test
    public void test1000() {
        assertEquals("M", solution.integerToRoman(1000));
    }
}
