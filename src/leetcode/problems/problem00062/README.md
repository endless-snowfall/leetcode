# Problem:
  Unique Paths
  
  A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
  The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

  How many possible unique paths are there?
  Note: m and n will be at most 100.
  
# Clarifications:
  - Are negative values of m and n valid? -> Assume yes and the result is 0.
  - Are zero values of m and n valid? -> Assume yes and the result is 0.
  - Are values of 1 valid for m and n? -> Assume yes and the result is 1.

# Approach:
## Approach (1): [BigInteger Solution]
  - If we were to write a sequence of moves to get from the start to the finish, the sequences would always be ((m-1) + (n-1)) in length.
  - Of this length of sequence, we are interested in permutations of the choice of going right m-1 times (or doing down n-1 times).
  - This is basically ((m-1) + (n-1)) choose (m-1), which is (m + n - 2)! / ((m - 1)! (n - 1)!)
  - This approach uses BigInteger to deal with multiplying big numbers and calculating large factorials.
  
## Approach (2): [DP Solution]
  - We want to create a 2D matrix of size m x n to store our intermediate results.
  - To initialize the matrix:
    - The first row will be 1's aside from the start.
    - The first column will be 1's aside from the start.
    - Basically that translates to there being only one way to traverse the top row and first column.
  - From there on, to populate the rest of the matrix, for each index i, j we add the values from i - 1 and j - 1;

# Runtime Analysis:
##Definitions:
  - m is the height of the grid.
  - n is the width of the grid.

## Overall:
### Approach (1):
  - Space: Constant
  - Time: O(m + n)
  
### Approach (2):
  - Space: O(m x n)
  - Time: O(m x n)

# Tags: Medium, BigInteger, Factorial, Math, Dynamic Programming, Quadratic

# Notes:
  - 12! is the largest that will fit in an integer.