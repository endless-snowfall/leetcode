package leetcode.problems.problem00202;

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
        assertFalse(solution.isHappy(-1));
    }

    @Test
    public void test2() {
        assertFalse(solution.isHappy(0));
    }

    @Test
    public void test3() {
        assertTrue(solution.isHappy(1));
    }

    @Test
    public void test4() {
        assertTrue(solution.isHappy(19));
    }

    @Test
    public void test5() {
        assertFalse(solution.isHappy(2));
    }
}
