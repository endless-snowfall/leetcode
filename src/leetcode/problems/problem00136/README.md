# Problem:
  Single Number
  
  Given an array of integers, every element appears twice except for one. Find that single one.

  Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
  
# Clarifications:
  - Are null/empty input valid? -> Assume no.
  - Are single-element arrays valid? -> Assume yes and the single element is the result.

# Approach:
## Approach (1):
  - Use a Set to hold elements that you've seen once, removing any that you encounter again.
  - At the end of the execution there should be only one element in the set.

## Approach (2): [Better]
  - Use a single int to represent the result, initialized to 0.
  - By the power of GreySkull:
    - (1) If you XOR 0 with a number, you get that number.
    - (2) If you XOR a number with itself, you get 0 -> they cancel out.

# Runtime Analysis:
##Definitions:
  - n is the size of the array.

## Overall:
### Approach (1):
  - Space: O(n)
  - Time: O(n)

### Approach (2):
  - Space: Constant
  - Time: O(n)

# Tags: Medium, Arrays, Numbers, Bit Manipulation, XOR, Linear

# Notes:
  - 