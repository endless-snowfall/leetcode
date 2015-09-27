# Problem:
  Remove Linked List Elements
  
  Remove all elements from a linked list of integers that have value val.

  Example
  Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
  Return: 1 --> 2 --> 3 --> 4 --> 5

# Clarifications:
  - Is an empty or null input list valid?
  - Does the list have to contain the value?
  - What if the result list is empty? -> Assume return null. 
  
# Approach:
  - Check for null and empty list.
  - Find first node that does that have the value.  It will be the new head and what we will return.
  - Go through the rest of the list structurally removing matching nodes, we will need a pointer to the previous to do this.
  - Initialize this previous to be the new head and start with the one after.
  
# Runtime Analysis:
##Definitions:
  - n is the size of the input list.
  
##Overall:
  - Space: No additional space is necessary as we modifying the input list.
  - Time: O(n) to process the input list once

# Tags: Linked List, Assumptions, Linear

# Notes:
  - When looking for the "new head" it may not exist and the helper can return null.  We should guard against this in the downstream code.