# Problem:
  Invert Binary Tree
  
  Invert a binary tree.

       4
     /   \
    2     7
   / \   / \
  1   3 6   9

  to
  
       4
     /   \
    7     2
   / \   / \
  9   6 3   1
  
# Clarifications:
  - Is null input valid? -> Assume yes and return is null.
  - Is a single-node tree valid? -> Assume yes and return is same node.

# Approach:
  - Native recursive solution, reverse children using a temp variable, then recurse on children.
  - We stop if the node passed in is null.

# Runtime Analysis:
##Definitions:
  - n is the number of nodes in the tree.
  - d is the depth.

##Overall:
  - Space: ?
  - Time: O(n) as all nodes need to be inverted.

# Tags: Easy, Trees, Binary Tree, Recursion

# Notes:
  - 