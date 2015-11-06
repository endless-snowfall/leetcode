package leetcode.problems.problem00268;

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
        assertEquals(-1, solution.missingNumber(null));
    }

    @Test
    public void test2() {
        assertEquals(-1, solution.missingNumber(new int[] {}));
    }

    @Test
    public void test3() {
        assertEquals(2, solution.missingNumber(new int[] { 0, 1, 3 }));
    }

    @Test
    public void test4() {
        assertEquals(1, solution.missingNumber(new int[] { 0 }));
    }
}
