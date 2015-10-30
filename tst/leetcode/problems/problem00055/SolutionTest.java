package leetcode.problems.problem00055;

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
        assertTrue(solution.canJump(new int[] { 2, 3, 1, 1, 4 }));
    }

    @Test
    public void test2() {
        assertFalse(solution.canJump(new int[] { 3, 2, 1, 0, 4 }));
    }
}
