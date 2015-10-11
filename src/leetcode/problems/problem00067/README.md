# Problem:
  Add Binary
  
  Given two binary strings, return their sum (also a binary string).

  For example,
  a = "11"
  b = "1"
  Return "100".
  
# Clarifications:
  - Are null/empty input valid? -> Assume yes.

# Approach:
  - Brutal while loop keep track of two indices in case the strings are of different length.
  - Use a StringBuilder so we can prepend the computed digits.
  - Keep track of a carry flag.

# Runtime Analysis:
##Definitions:
  - n is the length of the first string.
  - m is the length of the second string.

##Overall:
  - Space: O(Max(m, n)) since the result will have at least as many digits as the longer string.
  - Time: O(Max(m, n)) since we have to finish processing both strings.

# Tags: Easy, Binary, Strings, Gotcha, Linear

# Notes:
  - Gotcha for missing scenarios and improper resetting of the carry flag.
  - Revised algorithm to not worry about cases where the character was not present from one of the strings.  Instead, only care if they are 1's.