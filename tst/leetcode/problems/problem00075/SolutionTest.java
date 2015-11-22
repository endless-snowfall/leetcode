package leetcode.problems.problem00075;

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
        int[] input = null;
        solution.sortColors(input);
        assertNull(input);
    }

    @Test
    public void test2() {
        int[] input = new int[] { 0, 1, 2 };
        solution.sortColors(input);
        assertArrayEquals(new int[] { 0, 1, 2 }, input);
    }

    @Test
    public void test3() {
        int[] input = new int[] { 2, 1, 0 };
        solution.sortColors(input);
        assertArrayEquals(new int[] { 0, 1, 2 }, input);
    }
}
