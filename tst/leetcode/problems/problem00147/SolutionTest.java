package leetcode.problems.problem00147;

import static leetcode.problems.common.TestUtils.*;
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
        assertNull(solution.insertionSortList(null));
    }

    @Test
    public void test2() {
        assertListNodesEqual(
            createList(1),
            solution.insertionSortList(createList(1)));
    }

    @Test
    public void test3() {
        assertListNodesEqual(
            createList(1, 2),
            solution.insertionSortList(createList(1, 2)));
    }

    @Test
    public void test4() {
        assertListNodesEqual(
            createList(1, 2),
            solution.insertionSortList(createList(2, 1)));
    }

    @Test
    public void test5() {
        assertListNodesEqual(
            createList(1, 2, 3),
            solution.insertionSortList(createList(3, 2, 1)));
    }

    @Test
    public void test6() {
        assertListNodesEqual(
            createList(1, 2, 3),
            solution.insertionSortList(createList(2, 3, 1)));
    }

    @Test
    public void test7() {
        assertListNodesEqual(
            createList(1, 2, 2, 3, 4, 6, 6, 7, 8, 9, 10, 11),
            solution.insertionSortList(createList(10, 4, 7, 2, 6, 9, 8, 6, 3, 1, 2, 11)));
    }
}
