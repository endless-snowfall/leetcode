package leetcode.problems.problem00160;

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
        assertNull(solution.getIntersectionNode(null, null));
    }

    @Test
    public void test2() {
        assertNull(solution.getIntersectionNode(createList(1), null));
    }

    @Test
    public void test3() {
        assertNull(solution.getIntersectionNode(null, createList(1)));
    }

    @Test
    public void test4() {
        assertNull(solution.getIntersectionNode(createList(1), createList(2)));
    }

    @Test
    public void test5() {
        assertNull(solution.getIntersectionNode(createList(1, 2), createList(3)));
    }

    @Test
    public void test6() {
        assertNull(solution.getIntersectionNode(createList(3), createList(1, 2)));
    }

    @Test
    public void test7() {
        ListNode intersection = new ListNode(0);
        assertEquals(intersection, solution.getIntersectionNode(intersection, intersection));
    }

    @Test
    public void test8() {
        ListNode intersection = new ListNode(0);

        ListNode list1 = new ListNode(1);
        list1.next = intersection;

        assertEquals(intersection, solution.getIntersectionNode(list1, intersection));
    }

    @Test
    public void test9() {
        ListNode intersection = new ListNode(0);

        ListNode list2 = new ListNode(1);
        list2.next = intersection;

        assertEquals(intersection, solution.getIntersectionNode(intersection, list2));
    }

    @Test
    public void test10() {
        ListNode intersection = new ListNode(31);
        intersection.next = new ListNode(32);
        intersection.next.next = new ListNode(33);

        ListNode list1 = new ListNode(11);
        list1.next = new ListNode(12);
        list1.next.next = intersection;

        ListNode list2 = new ListNode(21);
        list2.next = new ListNode(22);
        list2.next.next = new ListNode(23);
        list2.next.next.next = intersection;

        assertEquals(intersection, solution.getIntersectionNode(list1, list2));
    }
}
