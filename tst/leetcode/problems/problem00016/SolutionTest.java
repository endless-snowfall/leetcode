package leetcode.problems.problem00016;

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
        assertEquals(2, solution.threeSumClosest(new int[] { -1, 2, 1, -4 }, 1));
    }

    @Test
    public void test2() {
        assertEquals(-1, solution.threeSumClosest(new int[] { -1, 2, 1, -4 }, -1));
    }
}
