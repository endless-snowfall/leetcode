# Problem:
  Same Tree
  
  Given two binary trees, write a function to check if they are equal or not.

  Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
  
# Clarifications:
  - Can the input be null?

# Approach:
  - Naive recursive solution.
  - Check that the nodes are either both null or their values are equal.
  - Check that both left children are equal.
  - Check that both right children are equal.

# Runtime Analysis:
##Definitions:
  - n is the number of nodes.
  - d is the depth of the tree.

##Overall:
  - Space: None
  - Time:
    - Best: O(1) the root is different.
    - Worst: O(n) the trees are the same.
    - Average: O(d) the lowest depth of difference.

# Tags: Easy, Trees, Recursion, Binary Tree, Logarithmic

# Notes:
  - 