# Problem:
  Number of Islands

  Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

  Example 1:

11110
11010
11000
00000
Answer: 1

Example 2:

11000
11000
00100
00011
Answer: 3
  
# Clarifications:
  - Is null input valid? -> Assume no.
  - Is empty input valid? -? Assume yes.

# Approach:
  - Iterate each element of the matrix looking for land (1).
  - Once land is found, we immediately increment the result and sink the island.
  - Sinking is a recursive helper method which propagates in all possible directions, its logic should guard against multiple invocations for the same index.

# Runtime Analysis:
##Definitions:
  - w is the width of the map, h is the height.

##Breakdown:
  - We need one iteration of the entire map O(wh) to look at each element.
  - Each element can be told to sink a maximum of 4 times (from each adjacent direction).

##Overall:
  - Space: O(1), constant.
  - Time: O(5wh), linear.

# Tags: Medium, Linear, Recursive, Matrix, Matrices

# Notes:
  - 