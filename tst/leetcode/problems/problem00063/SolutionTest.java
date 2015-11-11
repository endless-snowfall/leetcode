package leetcode.problems.problem00063;

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
        assertEquals(0, solution.uniquePathsWithObstacles(new int[0][0]));
    }

    @Test
    public void test2() {
        assertEquals(0, solution.uniquePathsWithObstacles(new int[0][1]));
    }

    @Test
    public void test3() {
        assertEquals(0, solution.uniquePathsWithObstacles(new int[1][0]));
    }

    @Test
    public void test4() {
        assertEquals(1, solution.uniquePathsWithObstacles(new int[1][1]));
    }

    @Test
    public void test5() {
        assertEquals(1, solution.uniquePathsWithObstacles(new int[1][2]));
    }

    @Test
    public void test6() {
        assertEquals(1, solution.uniquePathsWithObstacles(new int[2][1]));
    }

    @Test
    public void test7() {
        assertEquals(3, solution.uniquePathsWithObstacles(new int[2][3]));
    }

    @Test
    public void test8() {
        assertEquals(3, solution.uniquePathsWithObstacles(new int[3][2]));
    }

    @Test
    public void test9() {
        assertEquals(4496388, solution.uniquePathsWithObstacles(new int[36][7]));
    }

    @Test
    public void test10() {
        assertEquals(462, solution.uniquePathsWithObstacles(new int[6][7]));
    }

    @Test
    public void test11() {
        int[][] input = new int[][] {
            { 0, 0, 0 },
            { 0, 1, 0 },
            { 0, 0, 0 },
        };
        assertEquals(2, solution.uniquePathsWithObstacles(input));
    }

    @Test
    public void test12() {
        int[][] input = new int[][] {
            { 0, 0, 0 },
            { 0, 1, 0 },
            { 1, 0, 0 },
        };
        assertEquals(1, solution.uniquePathsWithObstacles(input));
    }

    @Test
    public void test13() {
        int[][] input = new int[][] {
            { 0, 0, 1 },
            { 0, 1, 0 },
            { 1, 0, 0 },
        };
        assertEquals(0, solution.uniquePathsWithObstacles(input));
    }
}
