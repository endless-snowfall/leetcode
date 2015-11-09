package leetcode.problems.problem00094;

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
        assertTrue(solution.inorderTraversal(null).isEmpty());
    }

    @Test
    public void test2() {
        assertEquals(Lists.newArrayList(1), solution.inorderTraversal(createTree(1)));
    }

    @Test
    public void test3() {
        assertEquals(Lists.newArrayList(2, 1, 3), solution.inorderTraversal(createTree(1, 2, 3)));
    }

    @Test
    public void test4() {
        assertEquals(Lists.newArrayList(4, 2, 5, 1, 6, 3, 7), solution.inorderTraversal(createTree(1, 2, 3, 4, 5, 6, 7)));
    }
}
