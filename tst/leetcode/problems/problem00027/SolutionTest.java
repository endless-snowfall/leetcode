package leetcode.problems.problem00027;

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
        assertEquals(0, solution.removeElement(null, 1));
    }

    @Test
    public void test2() {
        assertEquals(0, solution.removeElement(new int[] {}, 1));
    }

    @Test
    public void test3() {
        assertEquals(0, solution.removeElement(new int[] { 1 }, 1));
    }

    @Test
    public void test4() {
        assertEquals(0, solution.removeElement(new int[] { 1, 1 }, 1));
    }

    @Test
    public void test5() {
        assertEquals(1, solution.removeElement(new int[] { 1 }, 2));
    }

    @Test
    public void test6() {
        assertEquals(2, solution.removeElement(new int[] { 1, 1 }, 2));
    }

    @Test
    public void test7() {
        assertEquals(5, solution.removeElement(new int[] { 1, 2, 3, 4, 5 }, 6));
    }

    @Test
    public void test8() {
        assertEquals(1, solution.removeElement(new int[] { 1, 2 }, 1));
    }

    @Test
    public void test9() {
        assertEquals(1, solution.removeElement(new int[] { 1, 2 }, 2));
    }

    @Test
    public void test10() {
        assertEquals(2, solution.removeElement(new int[] { 1, 2, 3 }, 2));
    }

    @Test
    public void test11() {
        assertEquals(5, solution.removeElement(new int[] { 1, 2, 3, 4, 5, 6 }, 5));
    }
}
