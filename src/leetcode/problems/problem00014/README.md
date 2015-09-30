# Problem:
  Longest Common Prefix
  
  Write a function to find the longest common prefix string amongst an array of strings.
  
# Clarifications:
  - Can the input array be null/empty?
  - What should be returned in that case?
  - What bounds are there on the number of input Strings?
  - What characters will the input Strings consist of?

# Approach:
  - For the first iteration, see if the first char of the first string is common.
  - This requires checking one character for each string.
  - Use a StringBuilder to avoid string concatenation while building the prefix.

# Runtime Analysis:
##Definitions:
  - n is the number of input strings.
  - m is the average length of the input strings.
  - p is the number of chars in the longest common prefix.

##Overall:
  - Best: O(1): No strings have a common prefix, we will find out when we look at the first character of the second string.
  - Worst: O(n x m): All strings are the same length and the same string.
  - Average: O(p x n) characters to process until we stop.

# Tags: Strings, Arrays, More Planning

# Notes:
  - 