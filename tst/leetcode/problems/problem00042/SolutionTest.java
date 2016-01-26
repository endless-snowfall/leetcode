package leetcode.problems.problem00042;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    private Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertEquals(0, solution.trap(null));
    }

    @Test
    public void test2() {
        assertEquals(0, solution.trap(new int[] {}));
    }

    @Test
    public void test3() {
        assertEquals(6, solution.trap(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));
    }
}
