package leetcode.problems.common;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
public class ListNode {

    @NonNull public Integer val;
    public ListNode next;
}