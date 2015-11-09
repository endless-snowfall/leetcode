# Problem:
  Convert Sorted Array to Binary Search Tree
  
  Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
  
# Clarifications:
  - Are null/empty input valid? -> Assume yes and the result is null.
  - Is a single-element array valid input? -> Assume yes and the result is a single node tree.

# Approach:
  - Guard against the edge cases above.
  - Make a recursive helper to create a node and recurse to set the left and right children of this node.
  - We will need to pass a range into this helper for start, end.
  - The node will be the element at the mid position.
  - This recursive helper will terminate under two base cases:
    - (1) When start = end.
    - (2) When start > end.

# Runtime Analysis:
##Definitions:
  - n is the length of the input array.

##Overall:
  - Space: O(n)
  - Time: O(n)

# Tags: Medium, Arrays, Recursion, Binary Search, Binary Search Tree, Trees, BST, Linear

# Notes:
  - Watch those base cases.