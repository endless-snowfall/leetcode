# Problem:
  Rotate Image
  
  You are given an n x n 2D matrix representing an image.
  Rotate the image by 90 degrees (clockwise).

  Follow up: Could you do this in-place?
  
# Clarifications:
  - Are null/empty input valid? -> Assume yes and the result is to do nothing.

# Approach:
  - Recursive approach breaking the images into "layers".
  - At each layer:
    - (1) We use a buffer to "save" the top row.
    - (2) Then we use another buffer to read and rotate the left column -> the top row.
    - (3) Then we use a buffer to read and rotate the bottom row -> the left column.
    - (4) Then we use a buffer to read and rotate the right column -> the bottom row.
    - (5) Then we write the top row -> the right column.

# Runtime Analysis:
##Definitions:
  - 

##Breakdown:
  - 

##Overall:
  - Space: O(n)
  - Time: O(n/2)

# Tags: Medium, Arrays, Matrix, Rotate, Recursion, Concise Solution

# Notes:
  - 