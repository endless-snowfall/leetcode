package leetcode.problems.problem00119;

import static org.junit.Assert.*;

import java.util.Arrays;

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
        assertNull(solution.getRow(-1));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList(1), solution.getRow(0));
    }

    @Test
    public void test3() {
        assertEquals(Arrays.asList(1, 1), solution.getRow(1));
    }

    @Test
    public void test4() {
        assertEquals(Arrays.asList(1, 2, 1), solution.getRow(2));
    }

    @Test
    public void test5() {
        assertEquals(Arrays.asList(1, 3, 3, 1), solution.getRow(3));
    }

    @Test
    public void test6() {
        assertEquals(Arrays.asList(1, 4, 6, 4, 1), solution.getRow(4));
    }

    @Test
    public void test7() {
        assertEquals(Arrays.asList(1, 5, 10, 10, 5, 1), solution.getRow(5));
    }
}
