# Problem:
  Binary Tree Level Order Traversal
  
  Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

  For example:
  Given binary tree {3,9,20,#,#,15,7},
      3
     / \
    9  20
      /  \
     15   7

  return its bottom-up level order traversal as:

  [
    [3]
    [9,20],
    [15,7]
  ]
  
# Clarifications:
  - Similar to Problem 107.

# Approach:
  - Similar to Problem 107 but we don't reverse.

# Runtime Analysis:
##Definitions:
  - n is the number of nodes in the tree.
  - d is the depth of the tree.

##Breakdown:
  - We will have to go through all the nodes once so the runtime will be O(n).
  - The space is bounded by the maximum number of nodes per level.  So if the tree is a complete tree then the most that we hold is the number of nodes on the deepest level.

##Overall:
  - Space: O(2^d - 1)
  - Time: O(n)

# Tags: Easy, Trees, Binary Tree, Recursion, Linear

# Notes:
  -
