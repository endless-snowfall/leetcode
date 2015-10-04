# Problem:
  Longest Substring Without Repeating Characters
  
  Given a string, find the length of the longest substring without repeating characters.
  For example, the longest substring without repeating letters for "abcabcbb" is "abc",
  which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.

# Approach:
  - Use a map to keep track of the index where we saw characters.
  - Only need to track one entry per character since if we encounter the same one we update.
  - We have candidates when we encounter a repeated character AND when we encounter the end
    of the string.

# Runtime Analysis:
## Definitions:
  - n is the length of the input string.
  - m is the unique number of characters in the string.
    
## Breakdown:
  - O(n) to parse the input string.
  - O(m) to store all entries of unique characters in the input string.
    
## Overall:
  - Space: O(m)
  - Time: O(n)

## Tags: Medium, Strings, Tricky, Linear

## Notes:
  - Tricky detail when using the map is that we don't want to consider a "last seen" index if it's earlier than our current "start" index.