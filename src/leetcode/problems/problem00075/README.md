# Problem:
  Sort Colors
  
  Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
  Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

  Note: You are not suppose to use the library's sort function for this problem.
  
# Clarifications:
  - Are null/empty input valid? -> Assume yes and the result is unchanged.
  - Are single-element input valid? -> Assume yes and the result is unchanged.

# Approach:
## Approach:
  - Use Counting Sort
  - Process the input array and count the number of red/white/blue colors.
  - Do another pass of the input array and write the counted number of occurrences of each color.

# Runtime Analysis:
##Definitions:
  - n is the length of the input.

##Overall:
  - Space: None
  - Time: O(2n)

# Tags: Medium, Arrays, Sorting, Sort, Counting Sort, Linear, Unfinished

# Notes:
  - TODO: One-pass follow-up solution