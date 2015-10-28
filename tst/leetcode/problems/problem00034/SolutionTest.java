package leetcode.problems.problem00034;

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
            new int[] { -1, -1 },
            solution.searchRange(null, 0)));
    }

    @Test
    public void test2() {
        assertTrue(Arrays.equals(
            new int[] { -1, -1 },
            solution.searchRange(new int[] {}, 0)));
    }

    @Test
    public void test3() {
        assertTrue(Arrays.equals(
            new int[] { -1, -1 },
            solution.searchRange(new int[] { 0 }, 1)));
    }

    @Test
    public void test4() {
        assertTrue(Arrays.equals(
            new int[] { -1, -1 },
            solution.searchRange(new int[] { 0, 0 }, 1)));
    }

    @Test
    public void test5() {
        assertTrue(Arrays.equals(
            new int[] { 3, 4 },
            solution.searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 8)));
    }

    @Test
    public void test6() {
        assertTrue(Arrays.equals(
            new int[] { 1, 2 },
            solution.searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 7)));
    }

    @Test
    public void test7() {
        assertTrue(Arrays.equals(
            new int[] { 0, 0 },
            solution.searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 5)));
    }

    @Test
    public void test8() {
        assertTrue(Arrays.equals(
            new int[] { 5, 5 },
            solution.searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 10)));
    }

    @Test
    public void test9() {
        assertTrue(Arrays.equals(
            new int[] { 0, 2 },
            solution.searchRange(new int[] { 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4 }, 1)));
    }

    @Test
    public void test10() {
        assertTrue(Arrays.equals(
            new int[] { 3, 6 },
            solution.searchRange(new int[] { 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4 }, 2)));
    }

    @Test
    public void test11() {
        assertTrue(Arrays.equals(
            new int[] { 7, 11 },
            solution.searchRange(new int[] { 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4 }, 3)));
    }

    @Test
    public void test12() {
        assertTrue(Arrays.equals(
            new int[] { 12, 17 },
            solution.searchRange(new int[] { 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4 }, 4)));
    }

    @Test
    public void test13() {
        assertTrue(Arrays.equals(
            new int[] { -1, -1 },
            solution.searchRange(new int[] { 2, 2 }, 1)));
    }
}
