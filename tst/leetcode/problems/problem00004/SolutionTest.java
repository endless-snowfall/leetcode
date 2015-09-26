package leetcode.problems.problem00004;

import static org.junit.Assert.assertEquals;

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
        assertEquals("", solution.longestPalindrome(""));
    }

    @Test
    public void test2() {
        assertEquals("a", solution.longestPalindrome("a"));
    }

    @Test
    public void test3() {
        assertEquals("aba", solution.longestPalindrome("aba"));
    }

    @Test
    public void test4() {
        assertEquals("aba", solution.longestPalindrome("xaba"));
    }

    @Test
    public void test5() {
        assertEquals("aba", solution.longestPalindrome("abax"));
    }

    @Test
    public void test6() {
        assertEquals("aa", solution.longestPalindrome("aa"));
    }

    @Test
    public void test7() {
        assertEquals("abcba", solution.longestPalindrome("abcba"));
    }
}
