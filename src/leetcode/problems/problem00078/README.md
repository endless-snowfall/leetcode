# Problem:
  Subsets
  
  Given a set of distinct integers, nums, return all possible subsets.

  Note:
  Elements in a subset must be in non-descending order.
  The solution set must not contain duplicate subsets.
  For example,
  If nums = [1,2,3], a solution is:

  [
    [3],
    [1],
    [2],
    [1,2,3],
    [1,3],
    [2,3],
    [1,2],
    []
  ]
  
# Clarifications:
  - Are null or empty inputs allowed?
  - Should the empty set always be returned?

# Approach:
  - Guard against the above.
  - Sort the input array to meet the requirements.
  - Create a helper to take a List (that will grow), the input array, and an index (representing which number to pivot next).
  - The helper should guard against exceeding the array index bound -> this is how we should create the empty set.
  - The helper should assume that its recursive call would grow the result list.
  - The helper should duplicate all subsets in the result and prepend its pivot number to all subsets.
  - Finally, the helper should return the union of the the sets.

# Runtime Analysis:
##Definitions:
  - n is the number of items in the input array.

##Breakdown:
  - There will be n recursive calls.
  - There will be O(2^n) space used as that's required to create all subsets.
  - The array is traversed once as there is one recursive call made for each array element.
  
##Overall:
  - Space: O(2^n)
  - Time: O(n)

# Tags: Sets, Linear, Recursion

# Notes:
  - 