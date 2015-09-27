# Problem:
  Longest Palindromic Substring
  
  Given a string S, find the longest palindromic substring in S.
  You may assume that the maximum length of S is 1000, and there exists one
  unique longest palindromic substring.
  
# Approach:
  - Palindromes can either be centered around a single character or two characters.
  - Consider each character as the center of a palindrome.
  - Consider each pair of characters as the center of a palindrome.
  - Performs very badly when the string almost, if not entirely, consists of the same
    character.

# Runtime Analysis:
## Definitions:
  - n is the length of the input string.
  - m is the length of the average palindrome.
  - p is the average number of palindromes we have.
    
## Breakdown:
  - O(2n) for two passes of the input string, first for single character centers, second for two-character centers.
  - O(m) for each average length of a palindrome we encounter
  - O(2nmp)
    
## Best Case:
  - There are no palindromes exceeding one character in length so we do O(n + n) = O(n).
      
## Worst Case:
  - The entire string consists of the same character and is a palindrome.  At each center we would have to process until we reach one end of the string so it's O(n^2) for the single char centered + O(n^2) for the pair char centered for a total of O(n^2).
    
## Overall:
  - Space: O(1) for current longest palindrome
  - Time: O(2nmp)

## Tags: Strings, Tricky, Palindrome, Quadratic

## Notes:
  - First attempt times out on LeetCode