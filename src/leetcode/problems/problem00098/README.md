# Problem:
  Validate Binary Search Tree
  
  Given a binary tree, determine if it is a valid binary search tree (BST).

  Assume a BST is defined as follows:

  The left subtree of a node contains only nodes with keys less than the node's key.
  The right subtree of a node contains only nodes with keys greater than the node's key.
  Both the left and right subtrees must also be binary search trees.
  
# Clarifications:
  - Is null input valid? -> Assume yes and result is true.
  - Is a single-node tree valid? -> Assume yes and the result is true.
  - Is there a need to worry about integer overflow? -> Assume yes.

# Approach:
  - Guard against edge cases above.
  - We'll take a recursive approach and define a default min and max (inclusive) that are a valid range for each node.
  - As we recurse, we'll update this range accordingly.

# Runtime Analysis:
##Definitions:
  - n is the number of nodes in the tree.
  - h is the height of the tree.

##Breakdown:
  - O(n) as we check every node top-down.

##Overall:
  - Space: Constant or O(h) in terms of stack frames.
  - Time: O(n).

# Tags: Medium, Trees, BST, Binary Search Tree, Recursion, Linear, Integer Overflow, Gotcha

# Notes:
  - Got snagged by integer overflow.