# Problem:
  Implement Stack using Queues
  
  Implement the following operations of a stack using queues.

  push(x) -- Push element x onto stack.
  pop() -- Removes the element on top of the stack.
  top() -- Get the top element.
  empty() -- Return whether the stack is empty.

  Notes:
  You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
  Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
  You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).
  
# Clarifications:
  - Does the stack have to be thread-safe?

# Approach:
  - Use one queue to back the implementation.
  - push: Enqueue the element into the queue, track the top, O(1).
  - pop: We know the size of the queue so we can "cycle" the elements by re-enqueuing them and then removing the previous top.
  - top: Maintain a reference to this and return in O(1).
  - empty: Return whether the queue is empty.

# Runtime Analysis:
##Overall:
  - push: O(1)
  - pop: O(n)
  - top: O(1)
  - empty: O(1)

# Tags: Easy, Stacks, Queues, Design

# Notes:
  - 