# Problem:
  Permutations
  
  Given a collection of numbers, return all possible permutations.

  For example,
  [1,2,3] have the following permutations:
  [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
  
# Clarifications:
  - Are null/empty input valid? -> Assume yes.
  - What should be returned for the above? -> Assume empty list.

# Approach:
  - Recursive approach where at each step, an index i is passed to indicate the pivot number.
  - The pivot number is used to augment intermediate results by generating one new permutation for each position that the pivot can be positioned.
  - The recursion terminates when the helper is asked to process a single number.

# Runtime Analysis:
##Definitions:
  - n is the size of the input array.

##Breakdown:
  - There will be O(n) recursive calls.
  - Each step of the call will return O((n-1)!) results and will be augmented by a factor of n.
  - O(n!) space will be required to store all the permutations.
  
##Overall:
  - Space: O(n!)
  - Time: O(n)

# Tags: Medium, Arrays, Recursion, Factorial

# Notes:
  - 