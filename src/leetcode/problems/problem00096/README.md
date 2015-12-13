# Problem:
  Unique Binary Search Trees
  
  Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

  For example,
  Given n = 3, there are a total of 5 unique BST's.

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3
  
# Clarifications:
  - Can n be negative? -> Assume yes and the result is 0.
  - Can n be zero? -> Assume yes and the result is 0.

# Approach:
## Approach (1):
  - Guard against the edge cases above.
  - The key here is to decouple the different configurations of a BST from the actual values that are used in the BST.
  - We will define a recursive helper such that:
    - (1) if n is zero, then there is only one such BST that we can make.
    - (2) if n is one, then similarly we can only make one BST.
    - (3) if n is > 1 then we need to select each node as a possible root and determine the possible LST and RST configurations.
      - Since a new configuration could be produced by "holding" the LST the same and "varying" the RST, we need to multiply these recursive results together and attribute that to our result.
  - This problem has an interesting relationship with the Catalan Numbers.
  - This solution also times out on Leetcode as we are repeatedly and redundantly computing intermediate configurations.
  
## Approach (2): [Caching Solution]
  - Introduced memoization to avoid redundantly recomputing results.

# Runtime Analysis:
##Definitions:
  - n is the number of nodes in the tree.

##Overall:
  - Space: Constant
  - Time: Catalan Numbers

# Tags: Medium, Trees, Binary Search Trees, Tricky, Review, Catalan Numbers

# Notes:
  - 