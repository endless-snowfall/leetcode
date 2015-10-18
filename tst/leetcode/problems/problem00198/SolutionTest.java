package leetcode.problems.problem00198;

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
        assertEquals(0, solution.rob(null));
    }

    @Test
    public void test2() {
        assertEquals(0, solution.rob(new int[] {}));
    }

    @Test
    public void test3() {
        assertEquals(1, solution.rob(new int[] { 1 }));
    }

    @Test
    public void test4() {
        assertEquals(1, solution.rob(new int[] { 1, 1 }));
    }

    @Test
    public void test5() {
        assertEquals(2, solution.rob(new int[] { 1, 1, 1 }));
    }

    @Test
    public void test6() {
        assertEquals(12, solution.rob(new int[] { 1, 2, 3, 4, 5, 6 }));
    }

    @Test
    public void test7() {
        assertEquals(16, solution.rob(new int[] { 1, 2, 3, 4, 5, 6, 7 }));
    }

    @Test
    public void test8() {
        assertEquals(4, solution.rob(new int[] { 2, 1, 1, 2 }));
    }

    @Test
    public void test9() {
        assertEquals(103, solution.rob(new int[] { 1, 3, 1, 3, 100 }));
    }

    @Test
    public void test10() {
        assertEquals(2, solution.rob(new int[] { 1, 2 }));
    }

    @Test
    public void test11() {
        assertEquals(14, solution.rob(new int[] { 4, 1, 2, 7, 5, 3, 1 }));
    }
}
