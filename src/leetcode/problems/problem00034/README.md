# Problem:
  Search for a Range
  
  Given a sorted array of integers, find the starting and ending position of a given target value.
  Your algorithm's runtime complexity must be in the order of O(log n).

  If the target is not found in the array, return [-1, -1].

  For example,
  Given [5, 7, 7, 8, 8, 10] and target value 8,
  return [3, 4].
  
# Clarifications:
  - Is null/empty input valid? -> Assume yes and [-1, -1] is the result.
  - Can the target not be in the input? -> Assume yes and [-1, -1] is the result.
  - Could there be only one occurrence of the input? -> Assume yes and the result is [i, i].

# Approach:
  - Do a Binary Search to find any occurrence of target.
    - If we can't find one then we return [-1, -1] immediately.
  - Otherwise, we do another Binary Search variant to find the START index. We are looking for an index where:
    - (1) The number at the index is still the target, and
    - (2) The number left of the index is not the target.
      - We need to be careful if:
        - (1) We reach the start of the array.
        - (2) We jump too far out of the range of the target.
  - Then we do another Binary Search variant to find the END index.  We are looking for an index where:
    - (1) The number at the index is still the target, and
    - (2) The number to the right of the index is not the target.
      - We need to be careful if:
        - (1) We reach the end of the array.
        - (2) We jump too far out of the range of the target.

# Runtime Analysis:
##Definitions:
  - n is the length of the input array.
  - m is the number of occurrences of target.
  - n - m is the number of array elements that are not the target.
  - i is the index of the target that you find from the first BS.

##Breakdown:
  - O(log [n - m]) to find an occurrence of target.
  - O(log i) to find the start index.
  - O(log [n - i]) to find the end index.

##Overall:
  - Space: Constant
  - Time: O(log n)

# Tags: Medium, Arrays, Binary Search, Recursion, Gotcha, Logarithmic, Concise Solution

# Notes:
  - Got snagged on a bad termination case for binary search.  Was checking (start == end) but the fix was to make it (start > end).