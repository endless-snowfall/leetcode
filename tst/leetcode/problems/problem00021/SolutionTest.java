package leetcode.problems.problem00021;

import static leetcode.problems.common.TestUtils.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.ListNode;
import leetcode.problems.common.TestBase;

public class SolutionTest extends TestBase {

    private Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertNull(solution.mergeTwoLists(null, null));
    }

    @Test
    public void test2() {
        assertListNodesEqual(
            createList(1),
            solution.mergeTwoLists(createList(1), null));
    }

    @Test
    public void test3() {
        assertListNodesEqual(
            createList(1),
            solution.mergeTwoLists(null, createList(1)));
    }

    @Test
    public void test4() {
        assertListNodesEqual(
            createList(1, 1),
            solution.mergeTwoLists(createList(1), createList(1)));
    }

    @Test
    public void test4b() {
        assertListNodesEqual(
            createList(1, 1, 2),
            solution.mergeTwoLists(createList(1, 2), createList(1)));
    }

    @Test
    public void test5() {
        ListNode result = solution.mergeTwoLists(createList(1, 2, 3), createList(1, 2, 3));
        System.out.println(result);
        assertListNodesEqual(
            createList(1, 1, 2, 2, 3, 3),
            result);
    }

    @Test
    public void test6() {
        assertListNodesEqual(
            createList(1, 2, 3, 4, 5),
            solution.mergeTwoLists(createList(1, 3, 5), createList(2, 4)));
    }

    @Test
    public void test7() {
        assertListNodesEqual(
            createList(1, 2, 3, 4, 5),
            solution.mergeTwoLists(createList(1, 2, 3), createList(4, 5)));
    }
}
