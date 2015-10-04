# Problem:
  Merge Two Sorted Lists
  
  Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
  
# Clarifications:
  - Are null inputs valid?
  - What are the maximum and minimum lengths of the inputs?
  - Are there any duplicate values between the lists?

# Approach:
  - Need reference pointer to heads of each list.
  - Need to continue until those references are null, meaning both lists are empty (have been merged).
  - Need to build a new list keeping track of the tail, for appending to, and advancing.
  - Also need a reference to the head for returning the result;

# Runtime Analysis:
##Definitions:
  - Let m be the length of the first list.
  - Let n be the length of the second list.

##Overall:
  - Space: O(m + n) as we need to combine the lists, keep in mind we are not creating any new ListNode's.
  - Time: O(m + n) as we traverse each list only once.

# Tags: Easy, Linked List, Linear

# Notes:
  - 