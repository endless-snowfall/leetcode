# Problem:
  Length of Last Word
  
  Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

  If the last word does not exist, return 0.

  Note: A word is defined as a character sequence consists of non-space characters only.

  For example, 
  Given s = "Hello World",
  return 5.
  
# Clarifications:
  - Are null/empty input valid? -> Assume yes.
  - Are strings consisting entirely of spaces valid? -> Assume yes.
  
# Approach:
  - Guard against the edge cases from above.
  - Use a flag to track whether or not we've seen a non-space character.
  - This flag will be used to terminate the loop if we see a space after seeing a non-space character.
  - If we see a space character:
    - And we've already seen a non-space character, then we want to stop.
    - If we haven't seen a non-space character yet, then we want to continue looking.
  - If we see a non-space character:
    - Always set the flag to true.
    - Always add one to the result.

# Runtime Analysis:
##Definitions:
  - n is the number of characters in the String

##Overall:
  - Space: Constant
  - Time: O(n)

# Tags: Easy, Strings

# Notes:
  - 