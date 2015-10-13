# Problem:
  Pascal's Triangle
  
  Given numRows, generate the first numRows of Pascal's triangle.

  For example, given numRows = 5,
  Return
  
  [
       [1],
      [1,1],
     [1,2,1],
    [1,3,3,1],
   [1,4,6,4,1]
  ]
  
# Clarifications:
  - Can the input be non-positive? -> Assume yes and the result is an empty list.

# Approach:
  - Guard against the edge cases above.
  - We'll initialize our result to have one list of [1].
  - We need to base the results of the current row on the last row.
  - We know that we will be adding a "1" as the first and last element of this new row.
  - Now we need to define some loop to add possibly additional elements between these 1's.
  - For the second row we don't want anything, but for all rows after we want n-1 elements.

# Runtime Analysis:
##Definitions:
  - n is the row number

##Breakdown:
  - We know that row n will have n elements and that we'll have n lists.

##Overall:
  - Space: O(n).
  - Time: O(n).

# Tags: Easy, Numbers

# Notes:
  - Elegant solution based on smart index usage.