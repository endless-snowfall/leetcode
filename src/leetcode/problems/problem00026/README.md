# Problem:
  Remove Duplicates from Sorted Array
  
  Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

  Do not allocate extra space for another array, you must do this in place with constant memory.

  For example,
  Given input array nums = [1,1,2],

  Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
  
# Clarifications:
  - Is a null/empty array valid input?
  - What to return in those cases -> 0;

# Approach:
  - Guard against above cases.
  - Keep track, and advance, a writeIndex for the next unique number.
  - Skip over the first element of the array and initialize the writeIndex to be 1.
  - Each time we find a new unique number we:
    - Write the number to the write index.
    - Advance the writeIndex.
    - Seek for the next unique number.

# Runtime Analysis:
##Definitions:
  - n is the size of the array.

##Breakdown:
  - Only one pass of the array is done.

##Overall:
  - Space: None.
  - Time: O(n).

# Tags: Easy, Arrays, Linear

# Notes:
  - 