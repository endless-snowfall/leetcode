# Problem:
  Missing Number
  
  Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

  For example,
  Given nums = [0, 1, 3] return 2.

  Note: Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
  
# Clarifications:
  - Are null/empty input valid? -> Assume yes and the result is -1.

# Approach:
## Approach (1):
  - Use a boolean array of size input.length + 1 to track whether or not we've seen a number.
  - Go through the input array once and set the index of the boolean array (indexed by the number itself) to "true".
  - To find the missing number, go through the boolean array again looking for the only "false".

## Approach (2): [Concise]
  - The sum of 0, 1, 2, ..., n is n(n+1) / 2, where n is the length of the input array.
  - Knowing this, compute the expected sum and go through the input array subtracting numbers encountered from the sum.
  - The result is what remains of the sum.

# Runtime Analysis:
##Definitions:
  - n is the length of the input array.

##Breakdown:
  - 

##Overall:
  - Space: Constant
  - Time: O(n)

# Tags: Medium, Numbers, Arrays, Linear, Math

# Notes:
  - Sum of numbers series was relevant.