package leetcode.problems.problem00201;

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
        assertEquals(2147483646, solution.rangeBitwiseAnd(2147483646, 2147483647));
    }
}
