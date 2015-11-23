package leetcode.problems.problem00010;

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
        assertFalse(solution.isMatch("aa", "a"));
    }

    @Test
    public void test2() {
        assertTrue(solution.isMatch("aa", "aa"));
    }

    @Test
    public void test3() {
        assertFalse(solution.isMatch("aaa", "aa"));
    }

    @Test
    public void test4() {
        assertTrue(solution.isMatch("aa", "a*"));
    }

    @Test
    public void test5() {
        assertTrue(solution.isMatch("aa", ".*"));
    }

    @Test
    public void test6() {
        assertTrue(solution.isMatch("ab", ".*"));
    }

    @Test
    public void test7() {
        assertTrue(solution.isMatch("aab", "c*a*b"));
    }

    @Test
    public void test8() {
        assertFalse(solution.isMatch("ab", ".*c"));
    }

    @Test
    public void test9() {
        assertTrue(solution.isMatch("a", "ab*"));
    }

    @Test
    public void test10() {
        assertFalse(solution.isMatch("bccbbabcaccacbcacaa", ".*b.*c*.*.*.c*a*.c"));
    }

    @Test
    public void test11() {
        assertFalse(solution.isMatch("a", "ab*a"));
    }
}
