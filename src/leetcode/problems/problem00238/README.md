# Problem:
  Product of Array Except Self
  
  Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
  Solve it without division and in O(n).
  For example, given [1,2,3,4], return [24,12,8,6].

  Follow up: Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)
  
# Clarifications:
  - Are null/empty input valid? -> Assume yes and the result is 0.

# Approach:
  - Use an array of length n to store the product from the left, excluding the number at that position.
  - Use another array of length n to store the same thing from the right.
  - Now the result is simply the element in the left x the element in the right arrays.
  - We need to initialize the left and right arrays to contain 1's.

# Runtime Analysis:
##Definitions:
  - n is the length of the array.

##Breakdown:
  - 

##Overall:
  - Space: O(2n)
  - Time: O(n)

# Tags: Medium, Arrays, Linear, Multiplication, FromLeftAndRight

# Notes:
  - 