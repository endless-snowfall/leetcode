# Problem:
  Excel Sheet Column Title
  
  Given a positive integer, return its corresponding column title as appear in an Excel sheet.

  For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
  
# Clarifications:
  - 

# Approach:

## Approach (1):
  - No freaking idea what Iw as doing.
  
## Approach (2): [Concise]
  - Understand that we are trying to convert a base 10 number to base 26 using the alphabet.
  - The tricky thing is that it is 1 that maps to A, not 0, so let's subtract 1 from the number.
  - This is so that we force 0 to map to A and 25 to map to Z, which makes the math easier.
  - Next we build the string from the least significant digit to the most in a loop which:
    - Subtract 1 from the number to make the mapping easier.
    - Finds the remainder after taking the mod by 26.
    - Subtract the remainder from the number and divide it by the base of 26 to move on to the next digit.
  - Now that we have the digits in reverse, we reverse it and return the result.
  - This algorithm is very similar to how you would strip off the digits from the right in base 10.

# Runtime Analysis:
##Definitions:
  - 

##Breakdown:
  - 

##Overall:
  - Space: 
  - Time: 

# Tags: Easy, Concise Solution, Numbers, Strings, Mod, Tricky, Unknown Runtime

# Notes:
  - 