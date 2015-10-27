# Problem:
  Swap Nodes in Pairs
  
  Given a linked list, swap every two adjacent nodes and return its head.

  For example,
  Given 1->2->3->4, you should return the list as 2->1->4->3.

  Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
  
# Clarifications:
  - Is null input valid? -> Assume yes and the result is null.
  - Is a single element list valid input? -> Assume yes and we just return that node.
  - Is an odd numbered length list valid input? -> Assume yes and all the earlier pairs are swapped but the remaining one at the end is not.

# Approach:
  - Take a recursive approach by swapping two nodes and then making the next node after that the result of a recursive call.
  - Base cases:
    - (1) The node is null -> Return null.
    - (2) The node has no next -> Return that node.
    - (3) The node has a next:
      - Swap the nodes carefully and make the next of the swap the result of a recursive call starting with the next node.

# Runtime Analysis:
##Definitions:
  - n is the length of the input list.

##Overall:
  - Space: Constant but actually we are using one variable for each swap we do so it's O(n/2).
  - Time: O(n)

# Tags: Medium, Linked List, Recursion, Swap, Linear

# Notes:
  - 