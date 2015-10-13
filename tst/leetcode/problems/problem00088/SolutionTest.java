package leetcode.problems.problem00088;

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
        solution.merge(null, 0, null, 0);
    }

    @Test
    public void test2() {
        int[] nums1 = new int[] {};
        solution.merge(nums1, 0, new int[] {}, 0);
        assertTrue(Arrays.equals(new int[] {}, nums1));

    }

    @Test
    public void test3() {
        int[] nums1 = new int[] { 1 };
        solution.merge(nums1, 0, new int[] {}, 0);
        assertTrue(Arrays.equals(new int[] { 1 }, nums1));
    }

    @Test
    public void test4() {
        int[] nums1 = new int[] { 0 };
        solution.merge(nums1, 0, new int[] { 1 }, 1);
        assertTrue(Arrays.equals(new int[] { 1 }, nums1));
    }

    @Test
    public void test5() {
        int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
        solution.merge(nums1, 3, new int[] { 4, 5, 6 }, 3);
        assertTrue(Arrays.equals(new int[] { 1, 2, 3, 4, 5, 6 }, nums1));
    }

    @Test
    public void test6() {
        int[] nums1 = new int[] { 2, 4, 6, 0, 0, 0 };
        solution.merge(nums1, 3, new int[] { 1, 3, 5 }, 3);
        assertTrue(Arrays.equals(new int[] { 1, 2, 3, 4, 5, 6 }, nums1));
    }

    @Test
    public void test7() {
        int[] nums1 = new int[] { 4, 5, 6, 0, 0, 0 };
        solution.merge(nums1, 3, new int[] { 1, 2, 3 }, 3);
        assertTrue(Arrays.equals(new int[] { 1, 2, 3, 4, 5, 6 }, nums1));
    }

    @Test
    public void test8() {
        int[] nums1 = new int[] { 0 };
        solution.merge(nums1, 0, new int[] { 1 }, 1);
        assertTrue(Arrays.equals(new int[] { 1 }, nums1));
    }

    @Test
    public void test9() {
        int[] nums1 = new int[] { 1, 2, 4, 5, 6, 0 };
        solution.merge(nums1, 5, new int[] { 3 }, 1);
        assertTrue(Arrays.equals(new int[] { 1, 2, 3, 4, 5, 6 }, nums1));

        System.out.println(Arrays.toString(nums1));
    }

    @Test
    public void test10() {
        int[] nums1 = new int[] { 1, 0 };
        solution.merge(nums1, 1, new int[] { 2 }, 1);
        assertTrue(Arrays.equals(new int[] { 1, 2 }, nums1));
    }
}
