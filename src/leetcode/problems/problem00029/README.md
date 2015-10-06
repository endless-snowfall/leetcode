# Problem:
  Divide Two Integers
  
  Divide two integers without using multiplication, division and mod operator.

  If it is overflow, return MAX_INT.
  
# Clarifications:
  - Can the divisor be zero? -> Assume no.

# Approach:
## Common:
  - We need to consider all the situations where Integer overflow can happen!
  - Edge cases:
    - If the dividend is zero, then the result is always zero.
    - If the divisor is one, then the result is always the dividend.
    - If the divisor is -1, then we want to return -1 * the dividend BUT we can't do that if the dividend is Integer.MIN_VALUE.  We need to trap this situation.
  
  - Things to worry about:
    - Interesting observation is that the magnitude of Integer.MIN_VALUE and Integer.MAX_VALUE differ by 1.
    - So let's try to use addition to "approach" these two different directions.
    - Meaning, if the dividend is -ve then we want to go in the -ve direction.
    - And if the dividend is +ve, then head in the +ve direction.
    - We need to detect these situations and adjust the divisor accordingly.
    - We also need to keep track of the need to make the result negative before returning.
  
## Approach (1):
  - We keep track of a growing sum, which grows by adding the value of divisor to it per iteration.
  - We also keep track of a growing result, which represents the number of times we've added divisor to sum.
  - We greedily add as much as we can and approach the dividend but need to ensure that we don't surpass it.
  - We need to guard against integer overflow during this check.
  - We need to check things differently depending on what direction we're going in.
    - Worst +ve direction scenario is a dividend of Integer.MAX_VALUE.
    - Worst -ve direction scenario is a dividend of Integer.MIN_VALUE.

## Approach (2):
  - Similar to Approach (1) but we don't increase the value of the sum by a constant factor of 1 wrt the divisor.
  - Instead, we try to double the factor every time we can but once things stop fitting, we need to decrease and halve the factor.
  - Fitting in the factor had some interesting and deadly impact on the code.

# Runtime Analysis:
##Definitions:
  - n is the result, which is the max number of times the dividend can be divided by the divisor.

##Overall (1):
  - Space: Constant.
  - Time: O(n)

##Overall (2):
  - Space: Constant.
  - Time: O(log n)

# Tags: Medium, Numbers, Division, Math, Integer Overflow, Better Solution, Review

# Notes:
  - Very subtle bug introduced during the implementation of FasterSolution where [factor * divisor] overflowed.
  - Integer overflow guarding is evil!
  - Consider that any operation may overflow the integer in any direction.
  - Carefully consider what intermediate values have the possibility of overflowing and understand what "direction" values will approach.
  - Guard by re-arranging arithmetic components to balance this.