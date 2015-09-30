package leetcode.problems.problem00014;

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
        assertEquals("", solution.longestCommonPrefix(null));
    }

    @Test
    public void test2() {
        assertEquals("", solution.longestCommonPrefix(new String[0]));
    }

    @Test
    public void test4() {
        assertEquals("a", solution.longestCommonPrefix(new String[] { "a" }));
    }

    @Test
    public void test5() {
        assertEquals("a", solution.longestCommonPrefix(new String[] { "a", "ab" }));
    }

    @Test
    public void test6() {
        assertEquals("a", solution.longestCommonPrefix(new String[] { "ab", "ac" }));
    }

    @Test
    public void test7() {
        assertEquals("abc", solution.longestCommonPrefix(new String[] { "abcdef", "abcghi" }));
    }

    @Test
    public void test8() {
        assertEquals("abc", solution.longestCommonPrefix(new String[] { "abcdef", "abc", "abcghi" }));
    }

    @Test
    public void test9() {
        assertEquals("", solution.longestCommonPrefix(new String[] { "a", "b" }));
    }
}
