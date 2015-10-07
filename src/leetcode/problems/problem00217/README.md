# Problem:
  Contains Duplicate
  
  Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
  
# Clarifications:
  - Are null/empty input valid? -> Assume yes.
  - What about arrays of size 1? -> Assume yes.

# Approach:
  - Guard against the edge cases.
  - Sort the array, then do a single pass to compare the number at position i with i-1.
  - Careful to start the iteration at position 1, not 0.

# Runtime Analysis:
##Definitions:
  - n is the size of the input array.

##Breakdown:
  - O(n log n) to sort the input.
  - O(n) for the additional pass to compare adjacent numbers.
  - More precisely, it's only O(n) when there are no duplicates.  Otherwise it is O(m) where m is the sorted rank of the first duplicate.

##Overall:
  - Space: None, as we are sorting the original input.
  - Time: O(n log n).

# Tags: Easy, Arrays, Sorting, Linearithmic

# Notes:
  - 