# Problem:
  Unique Paths II
  
  Follow up for "Unique Paths":

  Now consider if some obstacles are added to the grids. How many unique paths would there be?
  An obstacle and empty space is marked as 1 and 0 respectively in the grid.

  For example, there is one obstacle in the middle of a 3x3 grid as illustrated below.
  [
  [0,0,0],
  [0,1,0],
  [0,0,0]
  ]

  The total number of unique paths is 2.
  Note: m and n will be at most 100.
  
# Clarifications:
  - Are negative values of m and n valid? -> Assume yes and the result is 0.
  - Are zero values of m and n valid? -> Assume yes and the result is 0.
  - Are values of 1 valid for m and n? -> Assume yes.

# Approach:
  - Similar approach to Problem 62 but the initialization stems from the start index [0][0].
  - We'll reuse the input array so that we don't have to allocate a new 2D matrix of the same dimensions.
  - Our strategy when overwriting the matrix is:
    - If the existing element is a 1, meaning there's an obstacle there, then we set the value to 0.  This means that there are zero paths that will get you to that index.
    - If the existing element is a 0 then we set the value to be the previous row + the previous column.
  - When we initialize the start index, if the value is 1 then we write a 0, otherwise we write a 1.
  - When we initialize the first row, if the value is a 1 then we write a 0, otherwise we write the value of the previous column.
  - When we initialize the first column, if the value is a 1 then we write a 0, otherwise we write the value of the previous row.

# Runtime Analysis:
##Definitions:
  - m is the height of the grid.
  - n is the width of the grid.

##Overall:
  - Space: Constant
  - Time: O(m x n)

# Tags: Medium, Matrix, Dynamic Programming, Quadratic

# Notes:
  - 