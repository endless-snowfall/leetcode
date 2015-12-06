# Problem:
  Roman to Integer
  
  Given a Roman numeral, convert it to an integer.
  Input is guaranteed to be within the range from 1 to 3999.
  
# Clarifications:
  - Are null/empty input valid? -> Assume no.

# Approach:
  - Similar to Problem 12, we'll use a map but store entries with Roman literals mapping to their base10 values.
  - We will also store the edge cases which consist of two-literal keys.
  - Now, we will iterate over the characters of the input greedily testing if a two-character sequence exists in the map.
    - When it does, we'll attribute that value to our result and increase a readIndex by 2.
  - If we are at the end of the string or if the two-character literal didn't exist, then we will just read one and attribute that.
  
# Runtime Analysis:
##Definitions:
  - d is the number of digits we're working with.

##Overall:
  - Space: Constant
  - Time: O(d)

# Tags: Easy, Numbers, Maps, Strings

# Notes:
  - 