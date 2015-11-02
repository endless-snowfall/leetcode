package leetcode.problems.problem00064;

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
        assertEquals(0, solution.minPathSum(null));
    }

    @Test
    public void test2() {
        assertEquals(0, solution.minPathSum(new int[][] {}));
    }

    @Test
    public void test3() {
        assertEquals(15, solution.minPathSum(new int[][] { { 1, 2, 3, 4, 5 } }));
    }

    @Test
    public void test4() {
        assertEquals(6, solution.minPathSum(new int[][] {
            { 1, 2, 3, 4, 5 },
            { 1, 1, 1, 1, 1 } }));
    }
}
