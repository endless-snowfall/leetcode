# Problem:
  Reverse Linked List
  
  Reverse a singly linked list.
  
# Clarifications:
  - Can the list be empty or null?
  
# Approach:
  - Take one node off at a time and add it to the head of a new list.
  - Need to keep track of the head and tail of the new list.
  
# Runtime Analysis:
##Definitions:
  - n is the size of the new list.
  
##Overall:
  - Space: O(n) to build the reversed list although we will be reusing ListNode's.
  - Time: O(n) to process the input list once.

# Tags: Easy, Linked List, Linear

# Notes:
  - Careful to sever the link after deciding the new head.  Need to run through a few examples to test the algorithm!