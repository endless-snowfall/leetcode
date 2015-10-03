package leetcode.problems.problem00020;

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
        assertTrue(solution.isValid(null));
    }

    @Test
    public void test2() {
        assertTrue(solution.isValid(""));
    }

    @Test
    public void test3() {
        assertTrue(solution.isValid("()"));
    }

    @Test
    public void test4() {
        assertTrue(solution.isValid("{}"));
    }

    @Test
    public void test5() {
        assertTrue(solution.isValid("[]"));
    }

    @Test
    public void test6() {
        assertTrue(solution.isValid("(){}[]"));
    }

    @Test
    public void test7() {
        assertFalse(solution.isValid("(]"));
    }

    @Test
    public void test8() {
        assertFalse(solution.isValid("([)]"));
    }
}
