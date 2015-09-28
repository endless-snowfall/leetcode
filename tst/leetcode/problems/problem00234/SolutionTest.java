package leetcode.problems.problem00234;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;
import leetcode.problems.common.TestUtils;

public class SolutionTest extends TestBase {

    private Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertTrue(solution.isPalindrome(null));
    }

    @Test
    public void test2() {
        assertTrue(solution.isPalindrome(TestUtils.createList(1)));
    }

    @Test
    public void test3() {
        assertTrue(solution.isPalindrome(TestUtils.createList(1, 2, 1)));
    }

    @Test
    public void test4() {
        assertTrue(solution.isPalindrome(TestUtils.createList(1, 2, 2, 1)));
    }

    @Test
    public void test5() {
        assertFalse(solution.isPalindrome(TestUtils.createList(99, 1, 2, 1)));
    }

    @Test
    public void test6() {
        assertFalse(solution.isPalindrome(TestUtils.createList(1, 2, 1, 99)));
    }

    @Test
    public void test7() {
        assertFalse(solution.isPalindrome(TestUtils.createList(99, 1, 2, 2, 1)));
    }

    @Test
    public void test8() {
        assertFalse(solution.isPalindrome(TestUtils.createList(1, 2, 2, 1, 99)));
    }
}
