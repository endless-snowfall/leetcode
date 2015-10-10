# Problem:
  Plus One
  
  Given a non-negative number represented as an array of digits, plus one to the number.

  The digits are stored such that the most significant digit is at the head of the list.
  
# Clarifications:
  - Are null/empty input valid? -> Assume yes and the result is [1].

# Approach:
  - Guard against the edge cases from above.
  - Identify that the only way we can have a result of greater length (number of digits) is if the input is all 9's.  i.e. 9999 + 1 = 10000.
  - Let's make that a special case and simply generate and return a larger power of ten in that situation.
  - Otherwise, we know the result has the same number of digits as the input.
  - We will sum the digits in the direction of least significant digit to most.  From the perspective of the array it will be from the end to the start.
  - We will keep track of a "carry" variable while we sum digits, it will be initialized to 1 so that we add 1 to the least significant digit.
  - After we do the addition we always immediately set the carry to 0.
  - If the intermediate sum is >= 10 then we do a mod and set the carry to 1.

# Runtime Analysis:
##Definitions:
  - n is the number of digits of the input.

##Breakdown:
  - We do a O(n) pass to count the number of 9's.
  - We then do another O(n) pass to sum the digits.

##Overall:
  - Space: O(n)
  - Time: O(n)

# Tags: Easy, Arrays, Addition, Mod, Linear

# Notes:
  - 