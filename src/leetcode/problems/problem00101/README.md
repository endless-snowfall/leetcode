# Problem:
  Symmetric Tree
  
  Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

  For example, this binary tree is symmetric:

      1
     / \
    2   2
   / \ / \
  3  4 4  3

  But the following is not:
      1
     / \
    2   2
     \   \
     3    3

  Note:
  Bonus points if you could solve it both recursively and iteratively.
  
# Clarifications:
  - BT vs. BST?

# Approach (Recursive):
  - Guard against null root.
  - Return result of invoking helper with root.left and root.right.
  - Make a recursive helper to check the following:
    - Both n1 and n2 are null -> return true;
    - One is null -> return false; 
    - Both are non-null -> check values equal -> invoke helper twice:
      - (1) Once for n1.left, n2.right
      - (2) Second time for n1.right, n2.left

# Runtime Analysis (Recursive):
##Definitions:
  - d is the depth of the tree

##Overall:
  - Space: O(d) as the max call stack is bounded by the depth.
  - Time: O(n) as each node is called once using the helper method.

# Tags: Tree, Binary Tree

# Notes:
  - 