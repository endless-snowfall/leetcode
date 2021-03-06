package leetcode.problems.problem00144;

import static leetcode.problems.common.TestUtils.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;

import leetcode.problems.common.TestBase;

public class SolutionTest extends TestBase {

    private IterativeSolution solution;

    @Before
    public void before() {
        solution = new IterativeSolution();
    }

    @Test
    public void test1() {
        assertTrue(solution.preorderTraversal(null).isEmpty());
    }

    @Test
    public void test2() {
        assertListsEqualUnordered(
            Lists.newArrayList(1),
            solution.preorderTraversal(createTree(1)));
    }

    @Test
    public void test3() {
        assertEquals(
            Lists.newArrayList(10, 5, 1, 7, 15, 11, 17),
            solution.preorderTraversal(createTree(10, 5, 15, 1, 7, 11, 17, null, null, null, null, null, null, null, null)));
    }
}
