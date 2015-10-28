package leetcode.problems.problem00035;

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
        assertEquals(0, solution.searchInsert(new int[] { 1, 3, 5, 6 }, 0));
    }

    @Test
    public void test2() {
        assertEquals(0, solution.searchInsert(new int[] { 1, 3, 5, 6 }, 1));
    }

    @Test
    public void test3() {
        assertEquals(1, solution.searchInsert(new int[] { 1, 3, 5, 6 }, 2));
    }

    @Test
    public void test4() {
        assertEquals(2, solution.searchInsert(new int[] { 1, 3, 5, 6 }, 5));
    }

    @Test
    public void test5() {
        assertEquals(2, solution.searchInsert(new int[] { 1, 3, 5, 6 }, 4));
    }

    @Test
    public void test6() {
        assertEquals(3, solution.searchInsert(new int[] { 1, 3, 5, 7 }, 7));
    }

    @Test
    public void test7() {
        assertEquals(3, solution.searchInsert(new int[] { 1, 3, 5, 7 }, 6));
    }

    @Test
    public void test8() {
        assertEquals(4, solution.searchInsert(new int[] { 1, 3, 5, 7 }, 8));
    }

    @Test
    public void test9() {
        assertEquals(0, solution.searchInsert(new int[] {}, 0));
    }

    @Test
    public void test10() {
        assertEquals(0, solution.searchInsert(null, 0));
    }

    @Test
    public void test11() {
        assertEquals(1, solution.searchInsert(new int[] { 1 }, 2));
    }

    @Test
    public void test12() {
        assertEquals(2, solution.searchInsert(new int[] { 1, 3 }, 4));
    }
}
