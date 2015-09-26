package leetcode.problems.problem00001;

import static org.junit.Assert.assertEquals;

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
        int[] nums = { 2, 7, 11, 15 };
        int[] result = solution.twoSum(nums, 9);
        // System.out.println(Arrays.toString(result));
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    public void test2() {
        int[] nums = { 3, 2, 4 };
        int[] result = solution.twoSum(nums, 6);
        // System.out.println(Arrays.toString(result));
        assertEquals(2, result[0]);
        assertEquals(3, result[1]);
    }

    @Test
    public void test3() {
        int[] nums = { 0, 4, 3, 0 };
        int[] result = solution.twoSum(nums, 0);
        // System.out.println(Arrays.toString(result));
        assertEquals(1, result[0]);
        assertEquals(4, result[1]);
    }

    @Test
    public void test5() {
        int[] nums = { -1, -2, -3, -4, -5 };
        int[] result = solution.twoSum(nums, -8);
        // System.out.println(Arrays.toString(result));
        assertEquals(3, result[0]);
        assertEquals(5, result[1]);
    }
}
