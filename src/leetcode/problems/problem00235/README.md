# Problem:
  Lowest Common Ancestor of a Binary Search Tree
  
  Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

  According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”

        _______6______
       /              \
    ___2__          ___8__
   /      \        /      \
   0      _4       7       9
         /  \
         3   5
         
  For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
  
# Clarifications:
  - Is null input valid? -> Assume yes and the result would be null.
  - Are p and q guaranteed to be in the BST? -> Assume yes.

# Approach:
  - Native recursive approach.
  - Guard against null input from above.
  - Check if the root is either p or q.
  - Check if both are in the LST -> recurse on LST (node.left).
  - Check if both are in RST -> recurse on RST (node.right).
  - Return the node otherwise.

# Runtime Analysis:
##Definitions:
  - n is the number of nodes in the tree.
  - d is the depth of the tree.

##Breakdown:
  - If the tree is balanced then it is O(log n).
  - If the tree is more like a linked list then it's O(n).

##Overall:
  - Space: We can do tail recursion so no space is necessary.
  - Time:
    - Average: O(log n).
    - Worst: O(n).

# Tags: Easy, Trees, Binary Search Tree, Recursion, Logarithmic

# Notes:
  - 