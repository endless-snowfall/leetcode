# Problem:
  Excel Sheet Column Number
  
  Related to question Excel Sheet Column Title (Problem 168)

  Given a column title as appear in an Excel sheet, return its corresponding column number.

  For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
  
# Clarifications:
  - Are null/empty input valid? -> Assume yes and the result is 0.

# Approach:
  - Guard against the edge cases above.
  - Keep track of the result, which we will add to as we go along.
  - Similar to rebuilding a base 10 number:
    - (1) We'll go through the digits from right to left.
    - (2) Extract the digit according to the base.
    - (3) The digit needs to be multiplied by the corresponding power of the base before being attributed to the result.

# Runtime Analysis:
##Definitions:
  - n is the length of the string.

##Breakdown:
  - 

##Overall:
  - Space: Constant.
  - Time: O(n).

# Tags: Easy, Strings, Numbers, Base Conversion, Linear

# Notes:
  - 