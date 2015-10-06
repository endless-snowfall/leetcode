package leetcode.problems.problem00242;

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
        assertTrue(solution.isAnagram("anagram", "nagaram"));
    }

    @Test
    public void test2() {
        assertFalse(solution.isAnagram("rat", "car"));
    }

    @Test
    public void test3() {
        assertTrue(solution.isAnagram(null, null));
    }

    @Test
    public void test4() {
        assertTrue(solution.isAnagram("", ""));
    }

    @Test
    public void test5() {
        assertFalse(solution.isAnagram(null, ""));
    }

    @Test
    public void test6() {
        assertFalse(solution.isAnagram("", null));
    }
}
