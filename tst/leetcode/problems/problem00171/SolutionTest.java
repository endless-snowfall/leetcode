package leetcode.problems.problem00171;

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
        assertEquals(1, solution.titleToNumber("A"));
    }

    @Test
    public void test2() {
        assertEquals(2, solution.titleToNumber("B"));
    }

    @Test
    public void test3() {
        assertEquals(3, solution.titleToNumber("C"));
    }

    @Test
    public void test4() {
        assertEquals(26, solution.titleToNumber("Z"));
    }

    @Test
    public void test5() {
        assertEquals(27, solution.titleToNumber("AA"));
    }

    @Test
    public void test6() {
        assertEquals(28, solution.titleToNumber("AB"));
    }

    @Test
    public void test7() {
        assertEquals(52, solution.titleToNumber("AZ"));
    }

    @Test
    public void test8() {
        assertEquals(53, solution.titleToNumber("BA"));
    }

    @Test
    public void test9() {
        assertEquals(78, solution.titleToNumber("BZ"));
    }

    @Test
    public void test10() {
        assertEquals(79, solution.titleToNumber("CA"));
    }

    @Test
    public void test11() {
        assertEquals(104, solution.titleToNumber("CZ"));
    }

    @Test
    public void test12() {
        assertEquals(677, solution.titleToNumber("ZA"));
    }

    @Test
    public void test13() {
        assertEquals(702, solution.titleToNumber("ZZ"));
    }

    @Test
    public void test14() {
        assertEquals(703, solution.titleToNumber("AAA"));
    }

    @Test
    public void test15() {
        assertEquals(728, solution.titleToNumber("AAZ"));
    }

    @Test
    public void test16() {
        assertEquals(729, solution.titleToNumber("ABA"));
    }

    @Test
    public void test() {
        assertEquals(1000000001, solution.titleToNumber("CFDGSXM"));
    }
}
