package leetcode.problems.problem00066;

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
            new int[] { 1 },
            solution.plusOne(null)));
    }

    @Test
    public void test2() {
        assertTrue(Arrays.equals(
            new int[] { 1 },
            solution.plusOne(new int[] {})));
    }

    @Test
    public void test3() {
        assertTrue(Arrays.equals(
            new int[] { 1 },
            solution.plusOne(new int[] { 0 })));
    }

    @Test
    public void test4() {
        assertTrue(Arrays.equals(
            new int[] { 2 },
            solution.plusOne(new int[] { 1 })));
    }

    @Test
    public void test5() {
        assertTrue(Arrays.equals(
            new int[] { 1, 0 },
            solution.plusOne(new int[] { 9 })));
    }

    @Test
    public void test6() {
        assertTrue(Arrays.equals(
            new int[] { 1, 0, 0, 0, 0 },
            solution.plusOne(new int[] { 9, 9, 9, 9 })));
    }

    @Test
    public void test7() {
        assertTrue(Arrays.equals(
            new int[] { 1, 4, 0, 0 },
            solution.plusOne(new int[] { 1, 3, 9, 9 })));
    }
}
