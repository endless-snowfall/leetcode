# Problem:
  Reverse Bits
  
  Reverse bits of a given 32 bits unsigned integer.

  For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).

  Follow up:
  If this function is called many times, how would you optimize it?
  
# Clarifications:
  - 

# Approach:
  - Keep track of a result, initialized to zero, and a mask, initialized to 1.
  - Now we want to go from least significant bit to most looking for 1's in n.
  - Whenever we find a 1, we need to set the 32-index bit of the result to 1 as well.
  - We will create a helper to set the bit at a certain index.

# Runtime Analysis:
##Definitions:
  - n is the number of bits in the integer, which will always be 32.

##Breakdown:
  - 

##Overall:
  - Space: Constant.
  - Time: Constant.

# Tags: Easy, Bits, Numbers, Binary, Reverse

# Notes:
  - 