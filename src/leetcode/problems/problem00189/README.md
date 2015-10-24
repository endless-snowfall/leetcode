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

## Approach (2): [Better]
  - Guard against the edge cases.
  - Use the Euclidean method to calculate the GCD of the length of the array and k.
  - Use the GCD to calculate the LCM.
    - LCM = (length * k) / GCD
  - We know that the LCM / k is the number of times we can swap an element of the array forward until we arrive where we started.
  - If we were to continue we would be overwriting our previous entries so we need to "shift" one position over and repeat.
  - The number of times we need to "shift over" is n / (LCM / k) times.
  - Use two loops, bounding the first one by n / (LCM / k), and the second one by LCM / k.
  
# Runtime Analysis:
##Definitions:
  - n is the size of the array.

##Overall:
  - Space: Constant.
  - Time: O(n).

# Tags: Easy, Arrays, Linear, Mod, Better Solution, GCD, LCM, Euclidean Method, Math

# Notes:
  - Learned that Java mod is weird in that negative values in from of the mod operator result in a negative answer.
  - Learned about the Euclidean method of calculating the GCD.