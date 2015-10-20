# Problem:
  Rotate Array
  
  Rotate an array of n elements to the right by k steps.

  For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

  Note:
  Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
  
# Clarifications:
  - Can k be negative? -> Assume no.
  - Can k be zero? -> Assume yes.

# Approach:
## Approach (1):
  - Copy the entire array so we don't have to worry about losing information.
  - Now start overwriting the original array from the kth index to the length + k.
  - Be careful that this write index can go out of bounds and should be modded.
  - Note that the read index will not go out of bounds.

## Approach (2): [In Progress]
  - Still working out how to do everything in-place with constant memory.
  - Am stuck on forward propagation approach where we end up on an index that we have already processed and end up repeating.
  
# Runtime Analysis:
##Definitions:
  - n is the size of the array.

##Overall:
  - Space: O(n).
  - Time: O(n).

# Tags: Easy, Arrays, Linear, Mod, Unfinished

# Notes:
  - Learned that Java mod is weird in that negative values in from of the mod operator result in a negative answer.