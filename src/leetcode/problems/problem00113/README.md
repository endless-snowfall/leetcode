# Problem:
  Path Sum II
  
  Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

  For example:
  Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1

  return
  
  [
     [5,4,11,2],
     [5,8,4,5]
  ]
  
# Clarifications:
  - Is null input valid? -> Assume yes and the result is an empty list.

# Approach:
  - We'll define a recursive helper which ingests a final result list as well as a candidate list to build a path.
  - We'll use the WaxOnWaxOff technique to build a candidate path, which is initialized to an empty list.
  - We'll also use a recursive helper.
  - When we detect a leaf node, we'll check if the value of the node is equal to the sum.
    - If it is, then we have a path and need to duplicate the path so far and also append the current node to the end of it.
    - If it's not, then we simply end this branch.
  - If it's not a leaf node that we're dealing with then we will append the current node to the candidate list and recurse for each child, subtracting the node's value from the sum when we recurse.
  - We need to remove the node from the candidate after we have recursed.
  
# Runtime Analysis:
##Definitions:
  - n is the number of nodes in the tree.

##Overall:
  - Space: O(n)
  - Time: O(n)

# Tags: Medium, Trees, Binary Trees, WaxOnWaxOff, Lists, Recursion, Linear

# Notes:
  - 