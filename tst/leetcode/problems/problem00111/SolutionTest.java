package leetcode.problems.problem00111;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;
import leetcode.problems.common.TestUtils;

public class SolutionTest extends TestBase {

    private Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertEquals(0, solution.minDepth(null));
    }

    @Test
    public void test2() {
        assertEquals(1, solution.minDepth(TestUtils.createTree(1)));
    }

    @Test
    public void test3() {
        assertEquals(2, solution.minDepth(TestUtils.createTree(1, null, 2)));
    }

    @Test
    public void test4() {
        assertEquals(2, solution.minDepth(TestUtils.createTree(1, 2, 3, null, null, 4, 5)));
    }
}
