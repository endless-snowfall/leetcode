package leetcode.problems.problem00148;

import static leetcode.problems.common.TestUtils.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;

public class SolutionTest extends TestBase {

    private MergeSortSolution solution;

    @Before
    public void before() {
        solution = new MergeSortSolution();
    }

    @Test
    public void test1() {
        assertNull(solution.sortList(null));
    }

    @Test
    public void test2() {
        assertListNodesEqual(
            createList(1),
            solution.sortList(createList(1)));
    }

    @Test
    public void test3() {
        assertListNodesEqual(
            createList(1, 2, 3),
            solution.sortList(createList(1, 2, 3)));
    }

    @Test
    public void test4() {
        assertListNodesEqual(
            createList(1, 2, 3),
            solution.sortList(createList(3, 2, 1)));
    }

    @Test
    public void test5() {
        assertListNodesEqual(
            createList(1, 2, 3),
            solution.sortList(createList(2, 1, 3)));
    }

    @Test
    public void test6() {
        assertListNodesEqual(
            createList(1, 2, 3, 4),
            solution.sortList(createList(4, 3, 2, 1)));
    }

    @Test
    public void test7() {
        assertListNodesEqual(
            createList(1, 2, 3, 4),
            solution.sortList(createList(2, 4, 3, 1)));
    }

    @Test
    public void test8() {
        assertListNodesEqual(
            createList(1, 2, 3, 4, 5),
            solution.sortList(createList(5, 4, 3, 2, 1)));
    }

    @Test
    public void test9() {
        assertListNodesEqual(
            createList(1, 1, 1),
            solution.sortList(createList(1, 1, 1)));
    }
}
