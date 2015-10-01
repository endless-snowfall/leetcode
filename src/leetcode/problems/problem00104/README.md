# Problem:
  Maximum Depth of Binary Tree
  
  Given a binary tree, find its maximum depth.

  The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
  
# Clarifications:
  - Can the input node be null?

# Approach:
  - Guard against null root.
  - Simple recursive function which checks if the node is null -> returns depth of 0.
  - Otherwise, return the max depth of the LST and RST adding 1.

# Runtime Analysis:
##Definitions:
  - d is the depth of the tree.

##Overall:
  - Space: O(log d) for recursive call stack.
  - Time: O(log d) for calculating max depth of tree.

# Tags: Trees, Binary Tree, Logarithmic

# Notes:
  - 