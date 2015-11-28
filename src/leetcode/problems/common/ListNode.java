package leetcode.problems.common;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ListNode {

    @NonNull public Integer val;
    public ListNode next;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("ListNode");
        ListNode node = this;
        while (true) {
            if (node == null) {
                builder.append(" -> null");
                break;
            }
            builder.append(" -> ").append(node.val);
            node = node.next;
        }
        return builder.toString();
    }
}