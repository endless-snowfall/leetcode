# Problem:
  Container With Most Water
  
  Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).
  n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
  Find two lines, which together with x-axis forms a container, such that the container contains the most water.

  Note: You may not slant the container.
  
# Clarifications:
  - How many heights to expect?
  - Range of height values?
  - Are negatives possible?

# Approach (1):
  - Two maps to hold height -> index values.
  - First to hold left-most indices, second to hold right-most indices.
  - Update second map when encountering new y values.
  - Consider pairs only.

# Runtime Analysis (1):
## Definitions:
  - x is length of input array.
  - n is number of distinct heights in input.
  - m is number of n that have at least a paired occurrence.
    
## Breakdown:
  - O(n) space for first map.
  - O(m) space for second map.
  - O(1) for candidate result.
  - O(x) to process input of x points.
  - O(n) to process maps for result.
    
## Overall:
  - Space: O(n + m)
  - Time: O(n)

# Approach (2):
  - For each height, try to find the left-most and right-most indices that are "compatible".
  - Calculate that area and test against running result.
  - Don't consider heights that are <= to the "minimum height seen" up to this point.
    
# Runtime Analysis (2):
## Definitions:
  - n is length of input array.
    
## Breakdown:
  - O(n) to find left and right-most indices for each height 
    
## Overall:
  - Space: O(1)
  - Time: O(n^2)

# Approach (3):
  - # Approach problem from opposite ends inwards.
  - The largest container area is created using the minimum height between the left and right-most edges.
  - Calculate that area and compare it to the running result.
  - Since we are going to move ONE edge after each iteration, choose to move the smaller one.
  - This is because:
    (1) We would only get a smaller area if we kept the smaller height.
    (2) Discarding the smaller height gives us a chance at a larger one.

# Runtime Analysis (3):
## Definitions:
  - n is length of input array.

## Overall:
  - Space: O(1)
  - Time: O(n)

# Tags: Medium, Arrays, Tricky, Reworked, Bad Assumptions, Incorrect, Inward Prune, Linear

# Notes:
  - Solution(1) and Solution(2) time out.
  - There was a bad assumption that exact height pairs were necessary to make a container.  [1, 2] -> 1 is a test case that is valid.