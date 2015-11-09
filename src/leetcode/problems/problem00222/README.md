# Problem:
  Count Complete Tree Nodes
  
  Given a complete binary tree, count the number of nodes.
  In a complete binary tree every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.
  
# Clarifications:
  - Is null input valid? -> Assume yes and the result is 0.
  - Is a single-node tree valid input? -> Assume yes and the result is 1.

# Approach:
## Approach (1):
  - Perform an in-order traversal to level depth - 1 and exit quickly when encountering a node with either 1 child or no children.
  - O(n) time.
  
## Approach (2):
  - Treat the bottom level of nodes like an array where we are trying find the edge of where the nodes end.
  - Go about this via Binary Search.
  - O(d^2) time.
  
## Approach (3):
  - Determine if the tree rooted at the note is a "perfect" tree where the tree is perfect if the left-most branch and the right-most branch have the same depth.
    - If so, then the entire tree is perfect.
  - Otherwise, see if the LST of the root is perfect:
    - (1) If it is then attribute that amount to a count for the number of nodes in the last level and recurse on the RST.
    - (2) If it's not then recurse on the LST.
  - We need to be aware of the actual depth of the left-most branch as we recurse right since if it never touches the bottom level then we know there are no relevant nodes there.

# Runtime Analysis:
##Definitions:
  - n is the number of nodes in the tree.
  - d is the depth of the tree.

##Breakdown:
  - At each iteration, we are decreasing the depth by one.

##Overall:
  - Space: Constant
  - Time: d + (d - 1) + (d - 2)...+ 0 = d^2 / 2

# Tags: Medium, Trees, Binary Trees, Recursion, Complete Trees, Perfect Trees, Review

# Notes:
  - Pretty brutal path to get a result that doesn't time out.
  - Learned that for some sub methods, recursive code is far cleaner than iterative code.
  - Also learned that 2^0 + 2^1 + 2^2 + ... 2^k = 2^(k + 1) - 1