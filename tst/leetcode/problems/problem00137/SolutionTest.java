package leetcode.problems.problem00137;

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
        assertEquals(3, solution.singleNumber(new int[] { 2, 2, 3, 2 }));
    }
}
