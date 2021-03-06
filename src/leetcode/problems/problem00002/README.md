# Problem:
  Add Two Numbers
  
  You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
  
  Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
  Output: 7 -> 0 -> 8

# Approach:
  - Iterate both lists at the same time.
  - If one ends then it doesn't advance anymore.
  - Build the result list as we go along, carrying if necessary.

# Runtime Analysis:
## Definitions:
  - m is the size of the first list.
  - n is the size of the second list.
    
## Breakdown:
  - O(max(m, n)) for iterating both lists.
  - O(max(m, n) + 1) for storing result, assuming we have to carry for each digit addition.
    
## Overall:
  - Space: O(max(m, n) + 1)
  - Time: O(max(m, n)

# Tags: Medium, Linked List, Linear

# Notes: