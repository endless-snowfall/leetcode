# Problem:
  Binary Tree Inorder Traversal
  
  Given a binary tree, return the inorder traversal of its nodes' values.
  For example: Given binary tree {1,#,2,3},
  
   1
    \
     2
    /
   3

  return [1,3,2].
  Note: Recursive solution is trivial, could you do it iteratively?
  
# Clarifications:
  - Is null input valid? -> Assume yes and the result is an empty list.
  - Is a single-node tree valid? -> Assume yes and the result is a list containing that one node.

# Approach:
## Approach (1): [Recursive]
  - Guard against the edge cases above.
  - Make a recursive helper which takes in a list and a node.
  - Typical recursive approach:
    - (1) Recurse on the node's left child.
    - (2) Add the node to the list.
    - (3) Recurse on the node's right child.
  - When the node is null, just return.

## Approach (2): [Iterative]
  - Guard against the edge cases above.
  - Use a stack to drive the execute.  Initialize the stack with the root.
  - Make an iterative helper which continues execution while the stack is not empty.
  - For every iteration:
    - (1) Pop a node off the stack.
    - (2) Check to see if the node has no children, if so -> add it to the list.
    - (3) Otherwise:
      - (a) If the node has a right child, add it to the stack, then break the bond to that right child.
      - (b) Add the node back onto the stack.
      - (c) If the node has a left child, add it to the stack, then break the bond to the left child.
   - The breaking of the bonds prevents us from repeating work and ensure we terminate.

# Runtime Analysis:
##Definitions:
  - n is the number of nodes in the tree.

##Overall:
  - Space: O(n)
  - Time: O(n)

# Tags: Medium, Trees, Binary Trees, Traversal, In-order Traversal, Linear, Stacks, Recursion

# Notes:
  - Remember to break bonds between nodes when taking iterative approach.