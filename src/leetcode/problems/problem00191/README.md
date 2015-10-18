# Problem:
  Number of 1 Bits
  
  Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).

  For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.

# Clarifications:
  - How should I deal with negative integers?

# Approach:
  - Use a mask and compare it to n 32 times to cover every possible bit value

# Runtime Analysis:
##Definitions:
  - 

##Breakdown:
  - n is the number of bits in an integer, always 32.

##Overall:
  - Space: Constant for the mask.
  - Time: O(n).

# Tags: Easy, Numbers, Binary, Bit Shifting, Review

# Notes:
  - 