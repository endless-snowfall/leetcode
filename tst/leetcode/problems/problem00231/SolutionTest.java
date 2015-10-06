package leetcode.problems.problem00231;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;

public class SolutionTest extends TestBase {

    private Solution2 solution;

    @Before
    public void before() {
        solution = new Solution2();
    }

    @Test
    public void test1() {
        assertFalse(solution.isPowerOfTwo(-1));
    }

    @Test
    public void test2() {
        assertFalse(solution.isPowerOfTwo(0));
    }

    @Test
    public void test3() {
        assertTrue(solution.isPowerOfTwo(1));
    }

    @Test
    public void test4() {
        assertTrue(solution.isPowerOfTwo(2));
    }

    @Test
    public void test5() {
        assertTrue(solution.isPowerOfTwo(128));
    }

    @Test
    public void test6() {
        assertFalse(solution.isPowerOfTwo(129));
    }

    @Test
    public void test7() {
        assertFalse(solution.isPowerOfTwo(5));
    }
}
