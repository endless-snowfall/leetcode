package leetcode.problems.problem00292;

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
        assertTrue(solution.canWinNim(1));
    }

    @Test
    public void test2() {
        assertTrue(solution.canWinNim(2));
    }

    @Test
    public void test3() {
        assertTrue(solution.canWinNim(3));
    }

    @Test
    public void test4() {
        assertFalse(solution.canWinNim(4));
    }

    @Test
    public void test5() {
        assertTrue(solution.canWinNim(5));
    }
}
