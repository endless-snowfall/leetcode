package leetcode.problems.problem00228;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;

import leetcode.problems.common.TestBase;

public class SolutionTest extends TestBase {

    private Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertTrue(solution.summaryRanges(null).isEmpty());
    }

    @Test
    public void test2() {
        assertTrue(solution.summaryRanges(new int[] {}).isEmpty());
    }

    @Test
    public void test3() {
        assertEquals(
            Lists.newArrayList("0"),
            solution.summaryRanges(new int[] { 0 }));
    }

    @Test
    public void test4() {
        assertEquals(
            Lists.newArrayList("0->1"),
            solution.summaryRanges(new int[] { 0, 1 }));
    }

    @Test
    public void test5() {
        assertEquals(
            Lists.newArrayList("0", "2->4"),
            solution.summaryRanges(new int[] { 0, 2, 3, 4 }));
    }

    @Test
    public void test6() {
        assertEquals(
            Lists.newArrayList("0->2", "4->5", "7"),
            solution.summaryRanges(new int[] { 0, 1, 2, 4, 5, 7 }));
    }
}
