package leetcode.problems.problem00002;

import leetcode.problems.common.ListNode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode tail = null;
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            int digit1 = 0;
            if (l1 != null) {
                digit1 = l1.val;
                l1 = l1.next;
            }

            int digit2 = 0;
            if (l2 != null) {
                digit2 = l2.val;
                l2 = l2.next;
            }

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode node = new ListNode(digit);

            if (result == null) {
                result = node;
            } else {
                tail.next = node;
            }

            tail = node;
        }

        return result;
    }
}
