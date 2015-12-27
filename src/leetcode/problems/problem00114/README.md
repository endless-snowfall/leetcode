# Problem:
  Flatten Binary Tree to Linked List
  
  Given a binary tree, flatten it to a linked list in-place.

  For example,
  Given

         1
        / \
       2   5
      / \   \
     3   4   6

  The flattened tree should look like:
  
   1
    \
     2
      \
       3
        \
         4
          \
           5
            \
             6
  
# Clarifications:
  - Is null input valid? -> Assume yes and we do nothing.

# Approach:
  - We need to be aware of the tail of an LL when building it from start to end.
  - We will use a stack and push work onto it.  The stack will be initialized with the root node.
  - We will continue execution so long as the stack is not empty.
  - For each iteration, we will:
    - (1) Pop a node off the stack.
    - (2) Immediate "append it to the end of our list by making tail.next equal to this node.  Watch out for the edge case when the tail is not set yet.
    - (3) If the node has a right child, then we will push it onto the stack and set the right child to null.
    - (4) If the node has a left child, then we will push it onto the stack and set the left child to null.
    - (5) Lastly, we will update our tail node to be this one.

# Runtime Analysis:
##Definitions:
  - n is the number of nodes in the tree.

##Overall:
  - Space: O(n)
  - Time: O(n)

# Tags: Medium, Stacks, Trees, Binary Trees, Linear

# Notes:
  - 