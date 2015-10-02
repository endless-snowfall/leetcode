# Problem:
  Balanced Binary Tree
  
  Given a binary tree, determine if it is height-balanced.

  For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
  
# Clarifications:
  - Is null/empty input valid?
  - Is a null/empty tree balanced -> Assume yes.

# Approach:
  - Need to know depths of two subtrees to determine if a node is balanced.
  - If doing this top-down we could be repeatedly calculating the depths over and over.
  - Need to define a scheme to do this bottom-up.
  - Return depth if balanced and a special value, -1, if not balanced.
  - If any node is not balanced then propagate up immediately.

# Runtime Analysis:
##Definitions:
  - d is the depth of the tree.
  - e is the depth of the most shallow node that is not balanced.

##Breakdown:
  - If the tree is balanced then:
    - Space: O(d) for recursive call stack. 
    - Time: O(d) as the depth of the entire tree must be calculated.
  - If the tree is not balanced then.
      - Space: O(e) for recursive call stack. 
      - Time: O(e)

# Tags: Binary Tree, Trees, Assumptions, Logarithmic

# Notes:
  - 