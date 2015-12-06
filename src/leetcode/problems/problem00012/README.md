# Problem:
  Integer to Roman
  
  Given an integer, convert it to a Roman numeral.
  Input is guaranteed to be within the range from 1 to 3999.
  
# Clarifications:
  - Are negative and zero input valid? -> Assume yes and the result is an empty string.

# Approach:
## Approach (1): [No Support for IV, IX, XL, XC, ...]
  - Define all the basic digits representing 1 to 1000 in a map.  The keys will be the base10 value and the value will be the String Roman literal.
  - We need the entries of this map ordered from largest key to smallest when we iterate it.
  - We will go through the map entries once and for each entry with key K and Roman literal V:
    - Determine the number of times we will use the Roman literal -> digitCount.
    - Append that number of literals to the result.
    - Decrease the value of n by (digitCount x digitValue);
  - The problem with this solution is that it cannot produce IV for 4.  Instead it produces IIII.
  
## Approach (2): [Complete Solution]
  - We should add the problematic numbers as digits to the map.

# Runtime Analysis:
##Definitions:
  - d is the number of digits we're representing.

##Breakdown:
  - 

##Overall:
  - Space: Constant
  - Time: O(d)

# Tags: Medium, Numbers, Maps, LinkedHashMap, Unfinished, Linear

# Notes:
  - Explore why Approach (2) actually works.
  - Learned about: AbstractMap.SimpleEntry, a way to create your own Collector