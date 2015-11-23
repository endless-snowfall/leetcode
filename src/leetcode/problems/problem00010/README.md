# Problem:
  Regular Expression Matching
  
  Implement regular expression matching with support for '.' and '*'.

  '.' Matches any single character.
  '*' Matches zero or more of the preceding element.
  
  The matching should cover the entire input string (not partial).
  
  The function prototype should be:
  bool isMatch(const char *s, const char *p)
  
  Some examples:
  
  isMatch("aa","a") → false
  
  isMatch("aa","aa") → true
  
  isMatch("aaa","aa") → false
  
  isMatch("aa", "a*") → true
  
  isMatch("aa", ".*") → true
  
  isMatch("ab", ".*") → true
  
  isMatch("aab", "c*a*b") → true
  
# Clarifications:
  - Is null input valid? -> Assume yes and that the result is false.

# Approach:
  - Use separate read indices for the string and the pattern.
  - Base cases:
    - (1) The pattern is fully processed.  If the string has been too then return TRUE, otherwise FALSE.
    - (2) The string has been fully processed.  At this point we can only process "x*" pairs of pattern characters.  If we don't have such a pair then return FALSE, otherwise we recurse, advancing the pattern index.
  - Now we try to break up the following situations:
    - (1) We have a ".*" pattern.
      - We want to iterate and recurse for all possibilities of consuming 0 to all remaining string characters.
      - If even one of these recursive results is TRUE, then return TRUE.
      - Otherwise return FALSE.
    - (2) We have a "x*" pattern, where the x is alphabetic.
      - Similar to (1) but we need to ensure that the character matches x before we proceed.
    - (3) We have a "." pattern.
      - Recurse and advance both indices to consume a single character.
    - (4) We have a "x" pattern, where the x is alphabetic.
      - Check that the character in the pattern matches the string, if not then return FALSE.
      - Otherwise recurse and advance both indices.

# Runtime Analysis:
##Definitions:
  - s is the length of the string.
  - p is the length of the pattern.

##Overall:
  - Space: None
  - Time: Unknown

# Tags: Hard, Strings, Regular Expression, Recursion, Recursive, Unknown Runtime

# Notes:
  - 