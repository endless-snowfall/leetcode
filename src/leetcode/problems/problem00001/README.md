# Problem:
  Two Sum
  
  Given an array of integers, find two numbers such that they add up to a specific target number.
  
  The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
  Please note that your returned answers (both index1 and index2) are not zero-based.
  
  You may assume that each input would have exactly one solution.
  
  Input: numbers={2, 7, 11, 15}, target=9
  Output: index1=1, index2=2

# Runtime Analysis:
## Definitions:
  - n is the size of the input array.
    
## Breakdown:
  - Initial O(n) to populate the map for backtracking to result.
  - O(n) to process array from both ends, terminating when either reaching target or left == right.
    
## Overall:
  - Space O(n)
  - Time O(n)

# Tags: Arrays, Sorting, Linear

# Notes:
  - Index in order implies sorting input array.
  - Needed to track original indices or array entries for result.
  - Needed to track indices of duplicate array entries.
  - Easier to sort result array before returning.