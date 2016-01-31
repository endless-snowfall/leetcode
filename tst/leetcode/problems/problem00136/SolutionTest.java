package leetcode.problems.problem00136;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;

public class SolutionTest extends TestBase {

    private ConciseSolution solution;

    @Before
    public void before() {
        solution = new ConciseSolution();
    }

    @Test
    public void test1() {
        assertEquals(0, solution.singleNumber(new int[] { 0 }));
    }

    @Test
    public void test2() {
        assertEquals(1, solution.singleNumber(new int[] { 0, 1, 0 }));
    }

    @Test
    public void test3() {
        assertEquals(2, solution.singleNumber(new int[] { 0, 1, 2, 1, 0 }));
    }
}
