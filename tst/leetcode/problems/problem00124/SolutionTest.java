package leetcode.problems.problem00124;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestUtils;

public class SolutionTest {

    private Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertEquals(0, solution.maxPathSum(null));
    }

    @Test
    public void test2() {
        assertEquals(6, solution.maxPathSum(TestUtils.createTree(1, 2, 3)));
    }
}
