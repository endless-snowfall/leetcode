# Problem:
  Path Sum
  
  Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

  For example:
  Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1

  return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
  
# Clarifications:
  - Is null input valid -> Assume yes and that the result is always false.
  - Do we need to worry about integer overflow?
  
# Approach:
  - Recursive approach.
  - Try to build up a total to reach the sum.
  - At every node:
    - Check if the node is null, if so, return false, otherwise add the node's value to the total.
    - Check if the node is a leaf, if so, evalute total == sum.
    - If it's not a leaf, then return the OR of recursing on the LST, RST.

# Runtime Analysis:
##Definitions:
  - n is the number of nodes in the tree.

##Breakdown:
  - We have to visit every node so it's O(n).

##Overall:
  - Space: Constant.
  - Time: O(n).

# Tags: Easy, Trees, Binary Tree, Recursion

# Notes:
  - 