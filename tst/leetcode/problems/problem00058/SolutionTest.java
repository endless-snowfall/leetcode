package leetcode.problems.problem00058;

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
        assertEquals(0, solution.lengthOfLastWord(null));
    }

    @Test
    public void test2() {
        assertEquals(0, solution.lengthOfLastWord(""));
    }

    @Test
    public void test3() {
        assertEquals(0, solution.lengthOfLastWord(" "));
    }

    @Test
    public void test4() {
        assertEquals(1, solution.lengthOfLastWord("a"));
    }

    @Test
    public void test5() {
        assertEquals(1, solution.lengthOfLastWord(" a"));
    }

    @Test
    public void test6() {
        assertEquals(1, solution.lengthOfLastWord("a "));
    }

    @Test
    public void test7() {
        assertEquals(2, solution.lengthOfLastWord("a ab"));
    }

    @Test
    public void test8() {
        assertEquals(2, solution.lengthOfLastWord("a ab "));
    }

    @Test
    public void test9() {
        assertEquals(3, solution.lengthOfLastWord("a ab abc"));
    }
}
