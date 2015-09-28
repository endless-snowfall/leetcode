# Problem:
  Reverse Linked List II
  
  Reverse a linked list from position m to n. Do it in-place and in one-pass.

  For example:
  Given 1->2->3->4->5->NULL, m = 2 and n = 4,

  return 1->4->3->2->5->NULL.

  Note:
  Given m, n satisfy the following condition:
  1 ≤ m ≤ n ≤ length of list.
  
# Clarifications:
  - Do I need to validate or guard against 1 ≤ m ≤ n ≤ length of list?
  - Is an empty/null/single node list possible input?
  - Can m == n? -> Assume yes.
  - Can m == n == 0? -> Assume yes.
  
# Approach:
  - Guard against null input.
  - Guard against m == 0 | n == 0;
  - Guard against 1 ≤ m ≤ n ≤ length of list.
  - If m == n then return the list since there is nothing to be reversed.
  - Fast forward m - 1 to have a pointer to m.prev.
  - Build a reversed list in place from m to n.
  - Attach m.prev to this list and the tail of this list to n.next.
  
# Runtime Analysis:
##Definitions:
  - n is the length of the list.
  
##Breakdown:
  - O(n) to count the number of nodes.
  - O(n) to traverse the list again.
  - O(m-n) to build the reversed portion of the list.
        
##Overall:
  - Space: O(1) as no new ListNode's will be created.
  - Time: O(n)

# Tags: Linked List, Linear, Reversed Indices, NullPointerException

# Notes:
  - Troubleshooting revealed mixing up indices while subtracting a difference.
  - Tricky scenario surrounding whether or not the head of the original list is involved in the reverse.  If it is not then the head of the original should be returned after re-attachment, otherwise we can return the start of the reversed list.