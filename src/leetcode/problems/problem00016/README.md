# Problem:
  3Sum Closest
  
  Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

  For example, given array S = {-1 2 1 -4}, and target = 1.
  The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
  
# Clarifications:
  - Are null/empty input arrays valid? -> Assume no.
  - Is integer overflow a concern? -> Assume no.

# Approach:
  - Very similar to Problem 15 except that we are given a target.
  - Initialize the result to be the sum of the first three elements (after sorting).
  - Run the algorithm exactly like Problem 15 except that we stop if we can actually find a triplet that sums to the target.
  - Otherwise we update the result based on which is closer using Math.abs

# Runtime Analysis:
##Definitions:
  - n is the length of the array.
  - d is the number of distinct numbers in the array.

##Breakdown:
  - Same breakdown as Problem 15.

##Overall:
  - Space: Constant
  - Time: O(d^2)

# Tags: Medium, Arrays, Sorting, Sum

# Notes:
  - 