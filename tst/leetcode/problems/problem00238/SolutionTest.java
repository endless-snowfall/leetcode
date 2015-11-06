package leetcode.problems.problem00238;

import static org.junit.Assert.*;

import java.util.Arrays;

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
        assertTrue(Arrays.equals(
            new int[] { 0 },
            solution.productExceptSelf(null)));
    }

    @Test
    public void test2() {
        assertTrue(Arrays.equals(
            new int[] { 0 },
            solution.productExceptSelf(new int[] {})));
    }

    @Test
    public void test3() {
        assertTrue(Arrays.equals(
            new int[] { 6, 3, 2 },
            solution.productExceptSelf(new int[] { 1, 2, 3 })));
    }

    @Test
    public void test4() {
        assertTrue(Arrays.equals(
            new int[] { 24, 12, 8, 6 },
            solution.productExceptSelf(new int[] { 1, 2, 3, 4 })));
    }
}
