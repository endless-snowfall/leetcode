# Problem:
  Majority Element
  
  Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

  You may assume that the array is non-empty and the majority element always exist in the array.
  
# Clarifications:
  - 

# Approach:
  - I know that if the length of the array is 1 or 2 then we just return the first element of the array.
  - Use a map to count the occurrences of each number, Map<Integer, Integer>.
  - This map will hold at most d distinct numbers.
  - We do a pass of the array and count each number but exit once we find out that already occurred n/2 times.

# Runtime Analysis:
##Definitions:
  - n is the length of the array.
  - d is the number of distinct numbers in the array.

##Breakdown:
  - O(n) pass of the array but only do a full pass if we need the last majority element occurrence.
  - O(d) space.

##Overall:
  - Space: O(d)
  - Time: O(n)

# Tags: Easy, Arrays, Linear

# Notes:
  -