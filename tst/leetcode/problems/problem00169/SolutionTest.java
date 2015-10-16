package leetcode.problems.problem00169;

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
        assertEquals(1, solution.majorityElement(new int[] { 1 }));
    }

    @Test
    public void test2() {
        assertEquals(2, solution.majorityElement(new int[] { 2, 2 }));
    }

    @Test
    public void test3() {
        assertEquals(1, solution.majorityElement(new int[] { 1, 1, 2 }));
    }

    @Test
    public void test4() {
        assertEquals(1, solution.majorityElement(new int[] { 2, 1, 1 }));
    }

    @Test
    public void test5() {
        assertEquals(1, solution.majorityElement(new int[] { 1, 2, 1 }));
    }

    @Test
    public void test6() {
        assertEquals(3, solution.majorityElement(new int[] { 3, 2, 3, 1, 3, 3, 1, 2, 3, 3, 1 }));
    }

    @Test
    public void test7() {
        assertEquals(1, solution.majorityElement(new int[] { 1, 1, 1, 2, 2 }));
    }

    @Test
    public void test8() {
        assertEquals(1, solution.majorityElement(new int[] { 2, 2, 2, 2, 1, 1, 1, 1, 1, 1 }));
    }
}
