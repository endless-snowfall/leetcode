# Problem:
  Binary Tree Level Order Traversal II
  
  Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

  For example:
  Given binary tree {3,9,20,#,#,15,7},
      3
     / \
    9  20
      /  \
     15   7

  return its bottom-up level order traversal as:

  [
    [15,7],
    [9,20],
    [3]
  ]
  
# Clarifications:
  - Can the input be null? -> Assume yes.
  - What is the result for the above? -> Assume empty list.

# Approach:
  - Do level-order as normal, using a queue to hold the TreeNode's of the previous level.
  - Add one result list per level and prepare the queue for the next level.
  - During recursion, if the input queue is empty then we stop.
  - At the end, we want to reverse our results so the bottom level results are first.
  - We can use Collections.reverse(...) which works in linear time.

# Runtime Analysis:
##Definitions:
  - n is the number of nodes in the tree.
  - d is the depth of the tree.

##Breakdown:
  - We will have to go through all the nodes once so the runtime will be O(n).
  - The last reverse is also O(n).
  - The space is bounded by the maximum number of nodes per level.  So if the tree is a complete tree then the most that we hold is the number of nodes on the deepest level.

##Overall:
  - Space: O(2^d - 1)
  - Time: O(n)

# Tags: Easy, Trees, Binary Tree, Recursion, Linear, Gotcha

# Notes:
  - Got screwed trying to loop on the queue size while modifying the queue.