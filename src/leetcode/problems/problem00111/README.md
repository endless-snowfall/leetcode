# Problem:
  Minimum Depth of Binary Tree
  
  Given a binary tree, find its minimum depth.

  The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
  
# Clarifications:
  - Is null input valid? -> Assume yes and result is 0.
  - Is a single-node tree valid? -> Assume yes and result is 1.

# Approach (1): [Selected]
  - Level-order search (BFS) using a queue.
  - Find the first node that is a leaf.  Recurse with the queue and adding to a result.

# Approach (2):
  - DFS like search, traversal.
  - No space required but we could be lucky/unlucky.

# Runtime Analysis:
##Common:
###Definitions:
  - n is the number of nodes in the tree.
  - d is the minimum depth.

##Breakdown (1):
  - If the tree is complete then we need O(2^n -1) space.
  - Algorithm will always run within O(2^d - 1) time.

##Breakdown (2):
  - Lucky: We've chosen the shortest path, O(d).
  - Unlucky: We've processed most of the tree and chose the shortest path last: O(n).

##Overall:
  - Space: O(2^d - 1).
  - Time: O(2^d - 1).

# Tags: Easy, Trees, Binary Tree, Recursion, BFS, Search

# Notes:
  - 