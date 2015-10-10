# Problem:
  Climbing Stairs
  
  You are climbing a stair case. It takes n steps to reach to the top.

  Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
  
# Clarifications:
  - Is negative or zero input valid? -> Assume yes and result is 0;

# Approach:
  - There are recursive and iterative solution.
  - The recursive solution looks a lot like Fibonacci Numbers.
  - The iterative solution has base cases for n = 0, 1, and 2.
  - We then set up the fn, fn-1, and fn-2 terms and loop, updating them as we go along.

# Runtime Analysis:
##Definitions:
  - n is the input.

##Breakdown:
  - For n values of 0, 1, and 2 we have base cases.
  - For values greater than equal to 3, we iterate from 3 to the number and build up our result.

##Overall:
  - Space: Constant
  - Time: O(n)

# Tags: Easy, Recursion, Fibonacci, Linear

# Notes:
  - The Recursive solution timed out.