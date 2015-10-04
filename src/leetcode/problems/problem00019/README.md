# Problem:
  Remove Nth Node From End of List
  
  Given a linked list, remove the nth node from the end of list and return its head.

  For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.

  Note:
  Given n will always be valid.
  Try to do this in one pass.
  
# Clarifications:
  - Will the given n always be valid? -> Yes
  - n = 1 means to remove the last node of the list.

# Approach:
  - Always need a reference to the previous node to remove a node.
  - Use two pointers, one to track the end and another to track the previous node of the want we want to remove (prev).
  - Tricky scenario when trying to remove the head of the list.

# Runtime Analysis:
##Definitions:
  - x is the length of the list.

##Breakdown:
  - O(n) to advance the end pointer ahead.
  - O(x - n) to advance the end pointer to the actual end of the list.
  - O(1) to remove the node.

##Overall:
  - Space: None used.
  - Time: O(x).

# Tags: Easy, Linked List, Remove, Removal, Linear

# Notes:
  - 