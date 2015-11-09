# Problem:
  Convert Sorted List to Binary Search Tree
  
  Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.
  
# Clarifications:
  - Are null/empty input valid? -> Assume yes and the result is null.
  - Is a single-element list valid input? -> Assume yes and the result is a single node tree.

# Approach:
## Approach (1):

## Approach (2): [Better]
  - 

# Runtime Analysis:
##Definitions:
  - n is the number of nodes in the input list

##Breakdown:
  - Each time we build a node we need to find the mid of the list.
  - We need to build a tree with n nodes and to find the mid it takes:
    - O(x), where x is the length of the sub list.
    - To find the root of the tree it takes O(n).
    - When we recurse on the LST and RST, it takes O(n/2) + O(n/2).
    - Another level deeper it takes O(n/4) + O(n/4) + O(n/4) + O(n/4).

##Overall:
  - Space: O(n)
  - Time: O(n^2)

# Tags: Lists, Trees, Binary Search Tree, BST, Linked Lists, Recursion, Quadratic Time

# Notes:
  - More base cases were needed to cover the cases where it would be impossible to find "prevToMid".