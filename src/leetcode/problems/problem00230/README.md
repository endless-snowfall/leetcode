# Problem:
  Kth Smallest Element in a BST
  
  Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

  Note: You may assume k is always valid, 1 ≤ k ≤ BST's total elements.
  
  Follow up: What if the BST is modified (insert/delete operations) often and you need to find the kth smallest frequently? How would you optimize the kthSmallest routine?
  
# Clarifications:
  - Is an empty tree valid? -> Assume no.
  - Can k be 1? -> Assume yes.
  - Can k be the number of nodes in the tree? -> Assume yes.

# Approach:
## Approach (1):
  - Use O(n) space to store a List of ordered node values from performing an in-order traversal of the BST.
  - The traversal takes O(n).
  - Then we traverse the List to retrieve the kth element.

## Approach (2): [Concise]
  - Use O(n) space to hold an object that tracks the rank and result value.
  - Perform an in-order traversal but exit early once we've reached our desired rank.
  - When we would print the node during the traversal, we will increase the rank of the result and immediately check if we've reach our desired rank.

# Runtime Analysis:
##Definitions:
  - n is the number of nodes in the tree.

##Overall:
  - Space: Constant, O(1).
  - Time: O(k).

# Tags: Medium, Trees, Binary Search Trees, BST, Logarithmic

# Notes:
  - 