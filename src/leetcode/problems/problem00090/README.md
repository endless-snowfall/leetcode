# Problem:
  Subsets II
  
  Given a collection of integers that might contain duplicates, nums, return all possible subsets.

  Note:
  Elements in a subset must be in non-descending order.
  The solution set must not contain duplicate subsets.
  For example,
  If nums = [1,2,2], a solution is:

  [
    [2],
    [1],
    [1,2,2],
    [2,2],
    [1,2],
    []
  ]
  
# Clarifications:
  - Similar to Problem 78.

# Approach:
  - Similar to Problem 78 except instead of passing in i + 1 on recursive calls, we advance the array index to the next unique number.

# Runtime Analysis:
##Definitions:
  - n is the input array length.
  - d is the number of unique numbers.

##Breakdown:
  - O(n log n) for sorting the array.
  - O(n) to traverse the entire array.
  - O(2^d) space to generate all subsets.

##Overall:
  - Space: O(2^d).
  - Time: O(n log n).

# Tags: Sets, Recursion, Sorting, Linearithmic

# Notes:
  - Getting the exact ordering that LeetCode wants is totally brutal.
  - In the end I couldn't avoid creating duplicates { 5, 5, 5, 5 } test case proved that.  I took the easy way out by checking for contains before adding.