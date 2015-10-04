package leetcode.problems.problem00283;

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
        int[] input = null;
        solution.moveZeroes(input);
        assertEquals(null, input);
    }

    @Test
    public void test2() {
        int[] input = new int[] {};
        solution.moveZeroes(input);
        assertTrue(Arrays.equals(new int[] {}, input));
    }

    @Test
    public void test3() {
        int[] input = new int[] { 0 };
        solution.moveZeroes(input);
        assertTrue(Arrays.equals(new int[] { 0 }, input));
    }

    @Test
    public void test4() {
        int[] input = new int[] { 1 };
        solution.moveZeroes(input);
        assertTrue(Arrays.equals(new int[] { 1 }, input));
    }

    @Test
    public void test5() {
        int[] input = new int[] { 0, 1 };
        solution.moveZeroes(input);
        assertTrue(Arrays.equals(new int[] { 1, 0 }, input));
    }

    @Test
    public void test6() {
        int[] input = new int[] { 0, 1, 0, 3, 12 };
        solution.moveZeroes(input);
        System.out.println(Arrays.toString(input));
        assertTrue(Arrays.equals(new int[] { 1, 3, 12, 0, 0 }, input));
    }
}
