# Problem:
  Pow(x, n)
  
  Implement pow(x, n).
  
# Clarifications:
  - Are negative values of x valid? -> Assume yes.
  - Is zero valid for x? -> Assume yes.
  - Are negative values of n valid? -> Assume yes.
  - Is zero valid for n? -> Assume yes.
  - Is there worry for overflow? -> Assume no.

# Approach:

## Approach (1):
  - There are a number of edge cases relating to -ve, 0, and 1 values of x and n:
    - (A) x is 0 -> the result will always be 0.
    - (B) n is 0 -> the result will always be 1.
    - (C) n is 1 -> the result will always be x.
  - Furthermore, n could be negative.  i.e: 2^-3 = 1 / (2^3) -> We could possible need to take the inverse of a result.
  - Also, x could be negative -> We could possibly need to make our result negative.
  - It seems like we should define a recursive helper which only deals with non-negative values of x and n.

## Approach (2): [Concise]
  - The code is much cleaner here as we don't need to explicitly handle negative values of a.
  - The code also doesn't explicitly handle the base case of n == 1.
  - 

# Runtime Analysis:
##Definitions:
  - n is the exponent.

##Breakdown:
  - We are using a recursive approach to perform less work.  At each step we will divide the exponent by two and only do half the work.  We also need to worry about a possible remainder.

##Overall:
  - Space: Constant
  - Time: O(log n)

# Tags: Medium, Math, Recursion, Logarithmic, Review, Concise Solution

# Notes:
  - 