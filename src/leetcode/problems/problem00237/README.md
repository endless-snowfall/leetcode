# Problem:
  Delete Node in a Linked List
  
  Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

  Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.
  
# Clarifications:
  - Can the list be null? -> Assume yes and we do nothing.
  - Can the tail node be the input? -> No.

# Approach:
  - Copy the values forward, overriding the value of the node to be deleted.
  - The last step is to remove the last node, which is no longer needed.

# Runtime Analysis:
##Definitions:
  - n is the size of the list.
  - m is the position of the node in the list.

##Breakdown:
  - We need to traverse from the mth node to the end of the list.
  - O(n-m)

##Overall:
  - Space: None.
  - Time: O(n-m).

# Tags: Easy, Linked List, Linear

# Notes:
  - 