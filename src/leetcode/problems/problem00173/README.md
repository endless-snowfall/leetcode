# Problem:
  Binary Search Tree Iterator
  
  Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.

  Calling next() will return the next smallest number in the BST.

  Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.

# Clarifications:
  - Is null a valid constructor input?
  - Will next() ever be called when hasNext() == false?

# Approach:
  - Cache the next integer using a field member.
  - Initialize this field in the constructor using a helper method, findNext().
  - We will use a stack to hold ancestors.
  - findNext returns the next and modifies the stack in the following way:
    - if the stack is empty it does nothing, so the next will not be set.
    - if the top has no children then we pop and return its value.
    - if the top has a left child then we break the reference and push its left child.
    - at this point we know the top is our next, and it should be popped, but it may have a right child.
    - if it does, then we break the reference and push its right child.
  
# Runtime Analysis:
##Definitions:
  - n is the number of nodes.
  - d is the depth of the tree.

##Overall:
  - hasNext(): O(1) as the next is always pre-computed.
  - next(): O(d) because we need to find the subsequent next.

# Tags: Trees, BST, Binary Search Tree, Design, Iterator

# Notes:
  - 