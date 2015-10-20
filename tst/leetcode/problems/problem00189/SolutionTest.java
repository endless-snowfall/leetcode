package leetcode.problems.problem00189;

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
        int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        solution.rotate(nums, 3);
        // System.out.println(Arrays.toString(nums));
        assertTrue(Arrays.equals(new int[] { 5, 6, 7, 1, 2, 3, 4 }, nums));
    }

    @Test
    public void test2() {
        int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        solution.rotate(nums, 10);
        // System.out.println(Arrays.toString(nums));
        assertTrue(Arrays.equals(new int[] { 5, 6, 7, 1, 2, 3, 4 }, nums));
    }

    @Test
    public void test3() {
        int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        solution.rotate(nums, 0);
        // System.out.println(Arrays.toString(nums));
        assertTrue(Arrays.equals(new int[] { 1, 2, 3, 4, 5, 6, 7 }, nums));
    }

    @Test
    public void test4() {
        int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        solution.rotate(nums, 1);
        // System.out.println(Arrays.toString(nums));
        assertTrue(Arrays.equals(new int[] { 7, 1, 2, 3, 4, 5, 6 }, nums));
    }

    @Test
    public void test5() {
        int[] nums = new int[] { 1, 2, 3, 4, 5, 6 };
        solution.rotate(nums, 2);
        // System.out.println(Arrays.toString(nums));
        assertTrue(Arrays.equals(new int[] { 5, 6, 1, 2, 3, 4 }, nums));
    }

    @Test
    public void test6() {
        int[] nums = new int[] { 1, 2, 3, 4, 5, 6 };
        solution.rotate(nums, 3);
        // System.out.println(Arrays.toString(nums));
        assertTrue(Arrays.equals(new int[] { 4, 5, 6, 1, 2, 3 }, nums));
    }

    @Test
    public void test7() {
        int[] nums = new int[] { 1, 2, 3, 4, 5, 6 };
        solution.rotate(nums, 4);
        // System.out.println(Arrays.toString(nums));
        assertTrue(Arrays.equals(new int[] { 3, 4, 5, 6, 1, 2 }, nums));
    }
}
