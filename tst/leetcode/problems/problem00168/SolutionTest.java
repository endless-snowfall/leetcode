package leetcode.problems.problem00168;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;

public class SolutionTest extends TestBase {

    private ConciseSolution solution;

    @Before
    public void before() {
        solution = new ConciseSolution();
    }

    @Test
    public void test1() {
        assertEquals("A", solution.convertToTitle(1));
    }

    @Test
    public void test2() {
        assertEquals("B", solution.convertToTitle(2));
    }

    @Test
    public void test3() {
        assertEquals("C", solution.convertToTitle(3));
    }

    @Test
    public void test4() {
        assertEquals("Z", solution.convertToTitle(26));
    }

    @Test
    public void test5() {
        assertEquals("AA", solution.convertToTitle(27));
    }

    @Test
    public void test6() {
        assertEquals("AB", solution.convertToTitle(28));
    }

    @Test
    public void test7() {
        assertEquals("AZ", solution.convertToTitle(52));
    }

    @Test
    public void test8() {
        assertEquals("BA", solution.convertToTitle(53));
    }

    @Test
    public void test9() {
        assertEquals("BZ", solution.convertToTitle(78));
    }

    @Test
    public void test10() {
        assertEquals("CA", solution.convertToTitle(79));
    }

    @Test
    public void test11() {
        assertEquals("CZ", solution.convertToTitle(104));
    }

    @Test
    public void test12() {
        assertEquals("ZA", solution.convertToTitle(677));
    }

    @Test
    public void test13() {
        assertEquals("ZZ", solution.convertToTitle(702));
    }

    @Test
    public void test14() {
        assertEquals("AAA", solution.convertToTitle(703));
    }

    @Test
    public void test15() {
        assertEquals("AAZ", solution.convertToTitle(728));
    }

    @Test
    public void test16() {
        assertEquals("ABA", solution.convertToTitle(729));
    }

    @Test
    public void test() {
        assertEquals("CFDGSXM", solution.convertToTitle(1000000001));
    }
}
