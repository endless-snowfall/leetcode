# Problem:
  Maximum Subarray
  
  Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

  For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
  the contiguous subarray [4,−1,2,1] has the largest sum = 6.

  More practice:
  If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
  
# Clarifications:
  - Are null/empty input valid? -> Assume yes and the result is 0.

# Approach:
## Approach (1):
  - Keep track of a result.
  - Loop through the array considering each position as the start of the max subsequence.
  - From each start index accumulate each value you encounter to a candidate variable.
    - After each accumulation, check to see if your candidate is larger than the result and if so, update it.
  - Takes O(n^2), quadratic time.
  
## Approach (2): [Better]
  - Keep track of a result and a candidate, which are both initialized to Integer.MIN_VALUE.
  - Go through the array once and for each element:
    - (1) If the candidate is still positive then add the element.
    - (2) Otherwise reset the candidate to that element.
  - Aggressively compare to see if the candidate is greater than the result, if so, update it.

# Runtime Analysis:
##Definitions:
  - n is the length of the array

##Overall:
  - Space: Constant
  - Time: O(n)

# Tags: Medium, Tricky, Linear, Review, Aggressive Compare

# Notes:
  - The Aggressive Compare technique ensures that we are always pro-actively updating the result if we *ever* find a better one.
  - If the candidate is negative then:
    - (1) There's no point adding a negative value to it, it will only get smaller.
    - (2) Rather than add a positive value to it, it's better to just "restart" a new subsequence from that positive value.
    - These two cases share a common action of resetting the candidate to being that number.
  - If the candidate is still positive then there's a chance we can still net something larger if we proceed so we keep adding.