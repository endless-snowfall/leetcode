# Problem:
  Minimum Path Sum
  
  Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

  Note: You can only move either down or right at any point in time.
  
# Clarifications:
  - Are null/empty input valid? -> Assume yes and the result is 0.

# Approach:
  - Dynamic programming 2D approach using the original grid to build the result.
  - Define C[i, j] to be the original cost of passing through i, j.
  - Define R[i, j] to be the minimum path to arrive at R[i, j].
  - Then R[i, j] = C[i, j] + min(R[i-1, j], R[i, j-1])
  - We can initialize the first row and column since you can only take rights, or downs respectively along those paths.

# Runtime Analysis:
##Definitions:
  - m is the height of the matrix, n is the width

##Overall:
  - Space: Constant as we are reusing the original matrix.
  - Time: O(m x n)

# Tags: Medium, Dynamic Programming, Matrix, Arrays

# Notes:
  - 