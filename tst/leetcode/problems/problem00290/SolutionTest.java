package leetcode.problems.problem00290;

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
        assertTrue(solution.wordPattern("abba", "dog cat cat dog"));
    }

    @Test
    public void test2() {
        assertFalse(solution.wordPattern("abba", "dog cat cat fish"));
    }

    @Test
    public void test3() {
        assertFalse(solution.wordPattern("aaaa", "dog cat cat dog"));
    }

    @Test
    public void test4() {
        assertFalse(solution.wordPattern("abba", "dog dog dog dog"));
    }

    @Test
    public void test5() {
        assertTrue(solution.wordPattern("aaaa", "dog dog dog dog"));
    }

    @Test
    public void test6() {
        assertTrue(solution.wordPattern("abab", "dog cat dog cat"));
    }

    @Test
    public void test7() {
        assertFalse(solution.wordPattern("aaaa", "dog dog dog"));
    }

    @Test
    public void test8() {
        assertFalse(solution.wordPattern("aaa", "dog dog dog dog"));
    }

    @Test
    public void test9() {
        assertTrue(solution.wordPattern("abba", "    dog cat cat dog    "));
    }
}
