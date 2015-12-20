package leetcode.problems.problem00261;

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
        int[][] input = new int[][] {
            { 0, 1, 1, 1, 0 },
            { 1, 0, 0, 0, 1 },
            { 1, 0, 0, 0, 0 },
            { 1, 0, 0, 0, 0 },
            { 0, 1, 0, 0, 0 },
        };
        assertTrue(solution.validTree(5, input));
    }

    @Test
    public void test2() {
        int[][] input = new int[][] {
            { 0, 1, 0, 0, 0 },
            { 1, 0, 1, 1, 1 },
            { 0, 1, 0, 1, 0 },
            { 0, 1, 0, 0, 0 },
            { 0, 1, 1, 0, 0 },
        };
        assertFalse(solution.validTree(5, input));
    }

    @Test
    public void test3() {
        int[][] input = new int[][] {
            { 0, 1, 0, 0, 0 },
            { 1, 0, 1, 0, 0 },
            { 0, 1, 0, 0, 0 },
            { 0, 0, 0, 0, 1 },
            { 0, 0, 0, 1, 0 },
        };
        assertFalse(solution.validTree(5, input));
    }
}
