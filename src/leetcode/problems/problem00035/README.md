# Problem:
  Search Insert Position
  
  Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
  You may assume no duplicates in the array.

  Here are few examples.
  [1,3,5,6], 5 → 2
  [1,3,5,6], 2 → 1
  [1,3,5,6], 7 → 4
  [1,3,5,6], 0 → 0
  
# Clarifications:
  - Are null/empty input valid? -> Assume yes and the result is 0.

# Approach:
  - Pretty tricky index hell doing this Binary Search variant.
  - Wanted to:
    - (1) Either find the number, or
    - (2) Find an element, x, such that:
      - (A) x < target < x.right, OR -> In this case we would return [x + 1].
      - (B) x.left < target < x -> In this case we would return [x].
  - There are some other branches of logic which are not obvious.  If we aren't lucky enough to find these two lucky bounds, then we still need to recurse in the proper direction to find them.
  - We have special cases when x is:
    - (1) 0, the start of the array -> We need to check if the result *would* be [0] and guard since recursing in that direction is dangerous.
    - (2) length - 1, the end of the array -> Similarly, need to check if the result *would* be [length].

# Runtime Analysis:
##Definitions:
  - n is the length of the array.

##Breakdown:
  - It's a Binary Search variant so O(log n).

##Overall:
  - Space: Constant
  - Time: O(log n)

# Tags: Medium, Arrays, Binary Search, Tricky, Gotcha, Logarithmic, Recursion

# Notes:
  - Got snagged on edge cases where we reached the start and end of the array.
  - There was a strange non-symmetrical edge case surrounding the start and end.