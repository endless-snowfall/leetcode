package leetcode.problems.problem00002;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.ListNode;

public class SolutionTest {

    private Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        ListNode list1 = createList(2, 4, 3);
        ListNode list2 = createList(5, 6, 4);
        ListNode expectedResult = createList(7, 0, 8);

        ListNode result = solution.addTwoNumbers(list1, list2);

        assertListNodesEqual(expectedResult, result);
    }

    private ListNode createList(int... values) {
        ListNode result = null;
        ListNode tail = null;

        for (int value : values) {
            ListNode node = new ListNode(value);
            if (result == null) {
                result = node;
            } else {
                tail.next = node;
            }
            tail = node;
        }

        return result;
    }

    private void assertListNodesEqual(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return;
        } else if (list1 != null && list2 != null) {
            if (list1.val != list2.val) {
                fail("Lists not Equal!");
            } else {
                assertListNodesEqual(list1.next, list2.next);
            }
        } else {
            fail("Lists not Equal!");
        }
    }
}
