package leetcode.problems.problem00165;

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
        assertEquals(0, solution.compareVersion("0.1", "0.1"));
    }

    @Test
    public void test2() {
        assertEquals(0, solution.compareVersion("0", "0"));
    }

    @Test
    public void test3() {
        assertEquals(0, solution.compareVersion(".1", ".1"));
    }

    @Test
    public void test4() {
        assertEquals(0, solution.compareVersion("0.1", ".1"));
    }

    @Test
    public void test5() {
        assertEquals(-1, solution.compareVersion("0.1", "1.1"));
    }

    @Test
    public void test6() {
        assertEquals(1, solution.compareVersion("1.1", "0.1"));
    }

    @Test
    public void test7() {
        assertEquals(-1, solution.compareVersion("1.1", "1.2"));
    }

    @Test
    public void test8() {
        assertEquals(1, solution.compareVersion("1.2", "1.1"));
    }

    @Test
    public void test9() {
        assertEquals(-1, solution.compareVersion("1.2", "13.37"));
    }

    @Test
    public void test10() {
        assertEquals(1, solution.compareVersion("13.37", "1.2"));
    }

    @Test
    public void test12() {
        assertEquals(1, solution.compareVersion("0.1", "0.0.1"));
    }

    @Test
    public void test13() {
        assertEquals(-1, solution.compareVersion("0.0.1", "0.1"));
    }

    @Test
    public void test14() {
        assertEquals(0, solution.compareVersion("1.1", "1.01.0"));
    }

}
