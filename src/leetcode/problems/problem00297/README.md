# Problem:
  Serialize and Deserialize Binary Tree
  
  Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.

  Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.

  For example, you may serialize the following tree

    1
   / \
  2   3
     / \
    4   5

  as "[1,2,3,null,null,4,5]", just the same as how LeetCode OJ serializes a binary tree. You do not necessarily need to follow this format, so please be creative and come up with different approaches yourself.

  Note: Do not use class member/global/static variables to store states. Your serialize and deserialize algorithms should be stateless.
  
# Clarifications:
  - Are null or single-node trees valid input? -> Assume yes.

# Approach:
  - Use the Pre-Order traversal where we print # when a node has a single-null child.
  - For leaves, we print out #,# to represent the two null children.
  - For example:
    - (1) A null tree would be represented by "#".
    - (1) A single-node tree of value 1 would be "1,#,#".
    - (2) A root of 1 with a left child of 2 would be "1,2,#,#,#".
    - (3) A root of 1 with a right child of 2 would be "1,#,2,#,#".
    - (4) A root of 1 with a left child of 2 and a right child of 3 would be "1,2,#,#,3,#,#".

# Runtime Analysis:
##Definitions:
  - ns is the number of nodes to serialize.
  - nd is the number of nodes to deserialize.

##Breakdown:
  - Serialization:
    - We use a StringBuilder to hold all the nodes to serialize so space is O(ns).
    - We also visit each node once so it will take O(ns) time.
  - Deserialization:
    - We parse the input string and generate a List of Strings, which takes O(nd) time and O(nd) space.
    - We then process the List once to create all the nodes, taking O(nd) time.

##Overall:
  - Space: O(n)
  - Time: O(n)

# Tags: Medium, Strings, Binary Trees, Serialization, Deserialization, Linear

# Notes:
  - 