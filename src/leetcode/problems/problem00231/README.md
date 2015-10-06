# Problem:
  Power of Two
  
  Given an integer, write a function to determine if it is a power of two.
  
# Clarifications:
  - Are negative and zero possible input? -> Assume yes.

# Approach:
  - Input is an integer so we don't have to worry about negative powers of 2.
  - If the input is <= 0 then the result is false.
  - Otherwise while the number is divisible by 2, we divide it.
  - At the end we return true only if the number is 1.

# Runtime Analysis:
##Definitions:
  - m is the number of times the number is divisible by 2.

##Overall:
  - Space: None.
  - Time: O(m)

# Tags: Easy, Numbers, Powers, Mod

# Notes:
  - 