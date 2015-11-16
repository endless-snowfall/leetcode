package leetcode.problems.problem00151;

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
        assertNull(solution.reverseWords(null));
    }

    @Test
    public void test2() {
        assertEquals("", solution.reverseWords(""));
    }

    @Test
    public void test3() {
        assertEquals("a", solution.reverseWords("a"));
    }

    @Test
    public void test4() {
        assertEquals("a", solution.reverseWords(" a"));
    }

    @Test
    public void test5() {
        assertEquals("a", solution.reverseWords("a "));
    }

    @Test
    public void test6() {
        assertEquals("a", solution.reverseWords(" a "));
    }
}
