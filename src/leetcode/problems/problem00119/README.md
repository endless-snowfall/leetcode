# Problem:
  Pascal's Triangle II
  
  Given an index k, return the kth row of the Pascal's triangle.

  For example, given k = 3,
  Return [1,3,3,1].

  Note:
  Could you optimize your algorithm to use only O(k) extra space?
  
# Clarifications:
  - Can the input be negative? -> Assume yes and the result is null;

# Approach:
  - Guard against the edge cases above.
  - We'll rework our previous solution to Problem 118 so that we're zero-based and instead of adding intermediate results to a list, we'll just overwrite a "lastRow" variable.

# Runtime Analysis:
##Definitions:
  - k is the row index

##Breakdown:
  - We are only storing the last row so we'll use at most O(k) space.

##Overall:
  - Space: O(k).
  - Time: O(k).

# Tags: Easy, Numbers

# Notes:
  -