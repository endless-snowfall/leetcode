package leetcode.problems.problem00191;

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
        assertEquals(0, solution.hammingWeight(0));
    }

    @Test
    public void test2() {
        assertEquals(1, solution.hammingWeight(1));
    }

    @Test
    public void test3() {
        assertEquals(3, solution.hammingWeight(11));
    }

    @Test
    public void test4() {
        // 10000000000000000000000000000000
        assertEquals(1, solution.hammingWeight(Integer.MIN_VALUE));
    }
}