package leetcode.problems.problem00009;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;

public class SolutionTest extends TestBase {

    private Solution1 solution1;

    @Before
    public void before() {
        solution1 = new Solution1();
    }

    @Test
    public void test1() {
        assertTrue(solution1.isPalindrome(0));
    }

    @Test
    public void test2() {
        assertTrue(solution1.isPalindrome(1));
    }

    @Test
    public void test3() {
        assertFalse(solution1.isPalindrome(-1));
    }

    @Test
    public void test4() {
        assertTrue(solution1.isPalindrome(12321));
    }

    @Test
    public void test5() {
        assertFalse(solution1.isPalindrome(912321));
    }

    @Test
    public void test6() {
        assertFalse(solution1.isPalindrome(123219));
    }

    @Test
    public void test7() {
        assertTrue(solution1.isPalindrome(123321));
    }

    @Test
    public void test8() {
        assertFalse(solution1.isPalindrome(9123321));
    }

    @Test
    public void test9() {
        assertFalse(solution1.isPalindrome(1233219));
    }

    @Test
    public void test10() {
        assertTrue(solution1.isPalindrome(1000000001));
    }

    @Test
    public void test11() {
        assertFalse(solution1.isPalindrome(10));
    }
}
