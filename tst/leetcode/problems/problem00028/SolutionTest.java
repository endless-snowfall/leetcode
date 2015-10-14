package leetcode.problems.problem00028;

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
        assertEquals(-1, solution.strStr(null, null));
    }

    @Test
    public void test2() {
        assertEquals(-1, solution.strStr(null, "needle"));
    }

    @Test
    public void test3() {
        assertEquals(0, solution.strStr("haystack", ""));
    }

    @Test
    public void test4() {
        assertEquals(0, solution.strStr("", ""));
    }

    @Test
    public void test5() {
        assertEquals(-1, solution.strStr("", "needle"));
    }

    @Test
    public void test6() {
        assertEquals(-1, solution.strStr("haystack", "needle"));
    }

    @Test
    public void test7() {
        assertEquals(0, solution.strStr("needlehaystack", "needle"));
    }

    @Test
    public void test8() {
        assertEquals(8, solution.strStr("haystackneedle", "needle"));
    }

    @Test
    public void test9() {
        assertEquals(4, solution.strStr("haysneedletack", "needle"));
    }

    @Test
    public void test10() {
        assertEquals(12, solution.strStr("aabaabaabaabaaa", "aaa"));
    }

    @Test
    public void test11() {
        assertEquals(4, solution.strStr("mississippi", "issip"));
    }

    @Test
    public void test12() {
        assertEquals(9, solution.strStr("mississippi", "pi"));
    }
}
