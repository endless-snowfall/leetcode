package leetcode.problems.problem00125;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;

public class SolutionTest extends TestBase {

    private BetterSolution solution;

    @Before
    public void before() {
        solution = new BetterSolution();
    }

    @Test
    public void test1() {
        assertTrue(solution.isPalindrome(null));
    }

    @Test
    public void test2() {
        assertTrue(solution.isPalindrome(""));
    }

    @Test
    public void test3() {
        assertTrue(solution.isPalindrome("a"));
    }

    @Test
    public void test4() {
        assertTrue(solution.isPalindrome("1"));
    }

    @Test
    public void test5() {
        assertTrue(solution.isPalindrome(" :,. "));
    }

    @Test
    public void test6() {
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void test7() {
        assertTrue(solution.isPalindrome("A man, a plan, a anal: Panama"));
    }

    @Test
    public void test8() {
        assertFalse(solution.isPalindrome("race a car"));
    }
}
