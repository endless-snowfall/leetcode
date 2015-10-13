package leetcode.problems.problem00038;

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
        assertEquals("", solution.countAndSay(-1));
    }

    @Test
    public void test2() {
        assertEquals("", solution.countAndSay(0));
    }

    @Test
    public void test3() {
        assertEquals("1", solution.countAndSay(1));
    }

    @Test
    public void test4() {
        assertEquals("11", solution.countAndSay(2));
    }

    @Test
    public void test5() {
        assertEquals("21", solution.countAndSay(3));
    }

    @Test
    public void test6() {
        assertEquals("1211", solution.countAndSay(4));
    }

    @Test
    public void test7() {
        assertEquals("111221", solution.countAndSay(5));
    }
}
