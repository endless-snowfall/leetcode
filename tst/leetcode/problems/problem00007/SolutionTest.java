package leetcode.problems.problem00007;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;
import leetcode.problems.problem00007.Solution;

public class SolutionTest extends TestBase {

    private Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertEquals(321, solution.reverse(123));
    }

    @Test
    public void test2() {
        assertEquals(-123, solution.reverse(-321));
    }

    @Test
    public void test3() {
        assertEquals(0, solution.reverse(0));
    }

    @Test
    public void test4() {
        assertEquals(5, solution.reverse(5));
    }

    @Test
    public void test5() {
        assertEquals(-5, solution.reverse(-5));
    }

    @Test
    public void test6() {
        assertEquals(Integer.MIN_VALUE, solution.reverse(-1999999999));
    }

    @Test
    public void test7() {
        assertEquals(Integer.MAX_VALUE, solution.reverse(1999999999));
    }
}
