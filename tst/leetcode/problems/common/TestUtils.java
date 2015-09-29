package leetcode.problems.common;

import static org.junit.Assert.*;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TestUtils {

    public static ListNode createList(int... values) {
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

    public static void assertListNodesEqual(ListNode list1, ListNode list2) {
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
