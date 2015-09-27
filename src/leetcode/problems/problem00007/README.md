# Problem:
  Reverse Integer
  
  Reverse digits of an integer.

  Example1: x = 123, return 321
  Example2: x = -123, return -321

# Clarifications:
  - What about numbers that when reversed exceed the boundaries of an integer?
  - Assumption: Limit result to MIN/MAX_INT.

# Approach:
  - Handle negatives like positives except we put the minus sign back on at the end.
  - Any single digit number is already reversed (aside from negatives).
  - MIN_INT is -2,147,483,648, so if -1,999,999,999 was reversed it would exceed that -> Assumption: Limit to MIN_INT.
  - MAX_INT is 2,147,483,647, so if 1,999,999,999 was reversed it would exceed that -> Assumption: Limit to MAX_INT.
    
# Runtime Analysis:
## Definitions:
  - n is the number of digits in the input integer.
    
## Breakdown:
  - O(n) to parse each digit once.
    
## Overall:
  - Space: O(n) to store digits of the new integer, or O(1) for a single integer.
  - Time: O(n) to process each digit of the input once.

# Tags: Integers, Linear, Integer Boundaries, Assumptions

# Notes:
  - Assumption turned out to be wrong, LeetCode was expecting 0 where MIN/MAX Integer boundaries were crossed.
