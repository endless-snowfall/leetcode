# Problem:
  Move Zeroes
  
  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

  For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

  Note:
  You must do this in-place without making a copy of the array.
  Minimize the total number of operations.
  
# Clarifications:
  - Are null/empty inputs allowed? -> Assume yes.

# Approach:
  - Keep track of a writeIndex and advance it after each write.
  - Initialize the writeIndex to be 0 and iterate the array from index 0.
  - Once we've "moved" all the non-zero elements to the start of the array, we need to fill the rest of the array with zeroes.

# Runtime Analysis:
##Definitions:
  - n is the size of the array.
  - z is the number of zeroes.
  - x is the number of non-zeroes.

##Breakdown:
  - O(n) since we look at all numbers in a first pass, writing x of them to the start of the array.
  - O(z) for filling in the trailing zeroes starting from where we left the writeIndex.

##Overall:
  - Space: Zero.
  - Time: O(n).

# Tags: Easy, Arrays, In Place, Linear, Assumptions

# Notes:
  - Be careful about advancing the index in a for loop because the end of the loop will add one to it.  A while loop may be cleaner.