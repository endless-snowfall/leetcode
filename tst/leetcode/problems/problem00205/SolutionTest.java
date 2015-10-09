package leetcode.problems.problem00205;

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
        assertTrue(solution.isIsomorphic(null, null));
    }

    @Test
    public void test2() {
        assertTrue(solution.isIsomorphic("", ""));
    }

    @Test
    public void test3() {
        assertTrue(solution.isIsomorphic("egg", "add"));
    }

    @Test
    public void test4() {
        assertFalse(solution.isIsomorphic("foo", "bar"));
    }

    @Test
    public void test5() {
        assertTrue(solution.isIsomorphic("paper", "title"));
    }

    @Test
    public void test6() {
        assertFalse(solution.isIsomorphic("ab", "aa"));
    }
}
