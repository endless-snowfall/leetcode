# Problem:
  Rectangle Area
  
  Find the total area covered by two rectilinear rectangles in a 2D plane.

  Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.

  Assume that the total area is never beyond the maximum possible value of int.
  
# Clarifications:
  - 

# Approach:
  - We need to calculate
    - (1) the area of the first rectangle
    - (2) the area of the second rectangle
    - (3) the area of the overlap, if there is one
  - Create a helper method to calculate the area of a rectangle.
  - Identify scenarios where the rectangles don't overlap.
  - When they do overlap, determine the coordinates of the bottom-left, and top-right of the overlap rectangle.

# Runtime Analysis:
##Definitions:
  - 

##Breakdown:
  - Algorithm does a constant amount of work independent of the input, so constant time.

##Overall:
  - Space: O(1)
  - Time: O(1)

# Tags: Easy, Geometry, Area, Constant

# Notes:
  - 