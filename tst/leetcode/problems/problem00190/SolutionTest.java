package leetcode.problems.problem00190;

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
        assertEquals(964176192, solution.reverseBits(43261596));
    }

    @Test
    public void test2() {
        assertEquals(1, solution.reverseBits(Integer.MIN_VALUE));
    }
}
