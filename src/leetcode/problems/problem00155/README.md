# Problem:
  Min Stack
  
  Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

  push(x) -- Push element x onto stack.
  pop() -- Removes the element on top of the stack.
  top() -- Get the top element.
  getMin() -- Retrieve the minimum element in the stack.
  
# Clarifications:
  - What should be returned for top() on an empty stack?
  - What should be returned for getMin() on an empty stack?
  - Should it be thread-safe?
  - Can the solution be backed by a stack implementation?

# Approach:
  - Create a custom type to encapsulate a value for the element as well as the minimum of the stack at that position.
  - push: We are either pushing a new minimum or not.  Determine and push accordingly.
  - pop/getMin/top: Guard against an empty stack.

# Runtime Analysis:

##Overall:
  - Space: Need to augment each element with the minimum.
  - Time: O(1) for ever operation.

# Tags: Stacks, Constant Time

# Notes:
  - 