# Problem:
  Binary Tree Preorder Traversal
  
  Given a binary tree, return the preorder traversal of its nodes' values.

  For example: Given binary tree {1,#,2,3},
  
   1
    \
     2
    /
   3
   
  return [1,2,3].

  Note: Recursive solution is trivial, could you do it iteratively?
  
# Clarifications:
  - Is null input valid? -> Assume yes and the result is an empty list.

# Approach:
##Approach (1): [Recursive]
  - Basic recursive approach.

##Approach (2): [Iterative]
  - Use a stack to track the work that is left to be done.
  - Initialize this stack to contain the root of the tree.
  - We will continue execution so long as the stack is not empty.  And for each iteration:
    - (1) We pop off a node from the stack.
    - (2) If the node has no children, we will add it to our result.
    - (3) Otherwise, if it has a right child then we will add it to the stack and then sever the edge from the node.
    - (4) If it has a left child then we will do the same.
    - (5) Finally, we will add the node (now with no children) onto the stack.

# Runtime Analysis:
##Definitions:
  - n is the number of nodes in the tree.

##Recursive:
  - Space: None
  - Time: O(n)
  
##Iterative:
  - Space: O(n)
  - Time: O(n)

# Tags: Medium, Trees, Binary Tree, Linear, Recursion, Stacks, Iterative, Recursive, Traversal

# Notes:
  -