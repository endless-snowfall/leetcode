# Problem:
  Remove Duplicates from Sorted List
  
  Given a sorted linked list, delete all duplicates such that each element appear only once.

  For example,
  Given 1->1->2, return 1->2.
  Given 1->1->2->3->3, return 1->2->3.
  
# Clarifications:
  - Is null input valid? -> Assume yes and we return null;

# Approach:
  - By default, we can set the first element to be the head of the result list.
  - We need to keep track of the tail of the result and only extend it when we encounter a "new" value.
  - We will need to keep track of that value as well.
  - At the end, we should ensure that we set the "next" of the final tail to be null.

# Runtime Analysis:
##Definitions:
  - n is the length of the list.

##Breakdown:
  - We only do one pass of the original list so it's O(n).
  - We keep track of the head and tail of the result so we use constant space.

##Overall:
  - Space: Constant
  - Time: O(n)

# Tags: Easy, Linked List, Removal, Linear

# Notes:
  - 