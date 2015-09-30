# Problem:
  Implement Queue using Stacks
  
  Implement the following operations of a queue using stacks.

  push(x) -- Push element x to the back of queue.
  pop() -- Removes the element from in front of queue.
  peek() -- Get the front element.
  empty() -- Return whether the queue is empty.

  Notes:
  You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
  Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
  You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).

# Clarifications:
  - Does the queue have to be thread-safe?

# Approach:
  - Use two stacks, one for enqueuing and one for dequeueing.
  - push: Simply push it into the "enqueue" stack.
  - pop: Check if the "dequeue" stack is non-empty -> Simply dequeue from it.  If it is empty then we need to check the "enqueue" stack to see if it can migrate everything to the "dequeue" stack.  Do so if necessary and pop after.
  - peek: Similar to pop.
  - empty: Check if both stacks are empty.

# Runtime Analysis:

##Overall:
  - push: Always O(1), as we simply push into the "enqueue" stack.
  - pop/peek:
    - Best O(1), if the "dequeue" stack is non-empty.
    - Worst O(n), if we need to migrate everything from the "enqueue" stack to the "dequeue" stack.
  - empty: Always O(1).

# Tags: Stacks, Queues, Design

# Notes:
  - 