# Problem:
  Remove Element
  
  Given an array and a value, remove all instances of that value in place and return the new length.

  The order of elements can be changed. It doesn't matter what you leave beyond the new length.
  
# Clarifications:
  - Are null/empty input valid? -> Assume yes.
  - Is the val guaranteed to occur in the input array? -> Assume no.

# Approach:
## Approach (1):
  - Sort the array so that all the val's, if they exist, would be together.
  - Now shift everything after the contiguous val's forward by the number of val's there are.
  - Runtime depends on how much there is after the val's.
  - Worst case is n - 1 copies.
  - O(n log n) + O(n)
  
## Approach (2):
  - Avoid shifting altogether.
  - Keep track of a left and write index.
  - The left index is looking for val's and will advance right until it finds one.
  - The right index is looking for non-val's and will advance left until it finds one.
  - Once we find a pair, we want to do a swap and advance both in their direction.
  - Once we are done, we simply return the value of left and avoid keeping track of a result variable.

# Runtime Analysis:
##Definitions:
  - n is the length of the input.

##Breakdown:
  - We only do one pass of the array from both ends until the pointers meet, so O(n).

##Overall:
  - Space: Constant
  - Time: O(n)

# Tags: Easy, Arrays, Removal, Gotcha

# Notes:
  - I was returning a one-off result when the condition on the while loop was [left < right] then I made it <=.
  - 