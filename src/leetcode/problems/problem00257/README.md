# Problem:
  Binary Tree Paths
  
  Given a binary tree, return all root-to-leaf paths.

  For example, given the following binary tree:

     1
   /   \
  2     3
   \
    5

  All root-to-leaf paths are: ["1->2->5", "1->3"]
  
# Clarifications:
  - Is null input valid? -> Assume yes.
  - What is the correct answer for null input? -> Assume empty list.

# Approach:
  - Build results bottom up by prepending node to result lists.
  - At each node, there should be n intermediate results for n leaves from that node.
  - Be careful when node is a leaf, need to return a list for that single node.  This is when both recursive calls yields no intermediate results.

# Runtime Analysis:
##Definitions:
  - n is the number of nodes.
  - d is the depth of the entire tree.
  - x is the number of leaf nodes.

Overall  - Space: There will be exactly x lists returned and each list will be of size di, where di is the depth of leaf xi.
  - Space: O(n) as all nodes must be visited once.
  - Time: O(d) for recursive call stack.

# Tags: Trees, Binary Tree

# Notes:
  - Learned that Arrays.asList is immutable!
  - Learned that List.add(index, element) is not supported by some lists.
  - Learned that LeetCode does not fully support Java 8.