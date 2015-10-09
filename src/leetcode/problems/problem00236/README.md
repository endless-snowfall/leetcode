# Problem:
  Lowest Common Ancestor of a Binary Tree
  
  Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

  According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”

        _______3______
       /              \
    ___5__          ___1__
   /      \        /      \
   6      _2       0       8
         /  \
         7   4
  
  For example, the lowest common ancestor (LCA) of nodes 5 and 1 is 3. Another example is LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.
  
# Clarifications:
  - Is null input valid? -> Assume yes and result is null;

# Approach (1):
  - Top-down approach.
  - At each node, check to see if the node is p or q.
  - If it is then return it as the answer.
  - Otherwise check to see if p is in the LST and if q is in the LST.
  - Recurse according to where p and q are.  If they are in separate ST's then return the node as the result.

# Approach (2): [Selected]
  - Bottom-up approach.
  - We want to avoid redoing the work from Approach (1).
  - Let's try to return a node up the tree instead.
  - So if we come across a node that is p or q, then let's return it as the result.
    - This ensures that if q is a descendant of p or vice-versa then that is covered.
  - If we don't then let's recurse on both the LST and RST.
  - We will have the following scenarios:
    - We found p in one ST and q in the other -> return node as the result.
    - We found p in one but nothing in the other -> return p.
    - We found q in one but nothing in the other -> return q.
    - We found nothing -> return null.
  - We should also return null if the node has no children.
  - This approach allows us to bubble up the result while using a scheme to deal with the bubbling.

# Runtime Analysis:
##Definitions:
  - n is the number of nodes in the tree.

##Breakdown (1):
  - The recursion looks like it is cutting the problem size in half in every step but that is only if the tree is complete.
  - If it is not complete then we are redoing a lot of work at each step.
  
##Breakdown (2):
  - We still visit all the nodes in the worst case.

##Overall:
  - Space: ?
  - Time: O(n)

# Tags: Medium, Trees, Binary Tree, Recursion, Bottom Up, Linear

# Notes:
  - 