package leetcode.problems.problem00067;

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
        assertNull(solution.addBinary(null, null));
    }

    @Test
    public void test2() {
        assertEquals("1", solution.addBinary(null, "1"));
    }

    @Test
    public void test3() {
        assertEquals("1", solution.addBinary("1", null));
    }

    @Test
    public void test4() {
        assertEquals("1", solution.addBinary("1", ""));
    }

    @Test
    public void test5() {
        assertEquals("1", solution.addBinary("", "1"));
    }

    @Test
    public void test6() {
        assertEquals("0", solution.addBinary("0", "0"));
    }

    @Test
    public void test7() {
        assertEquals("1", solution.addBinary("1", "0"));
    }

    @Test
    public void test8() {
        assertEquals("1", solution.addBinary("0", "1"));
    }

    @Test
    public void test9() {
        assertEquals("10", solution.addBinary("1", "1"));
    }

    @Test
    public void test10() {
        assertEquals("100", solution.addBinary("11", "1"));
    }

    @Test
    public void test11() {
        assertEquals("10000000000", solution.addBinary("1111111111", "1"));
    }

    @Test
    public void test12() {
        assertEquals("10101", solution.addBinary("1010", "1011"));
    }

    @Test
    public void test13() {
        assertEquals("110110", solution.addBinary("100", "110010"));
    }

    @Test
    public void test14() {
        assertEquals("1000", solution.addBinary("100", "100"));
    }
}
