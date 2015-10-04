# Problem:
  Valid Parentheses
  
  Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
  
# Clarifications:
  - Is null/empty input valid? -> Assume yes.
  - What is the expected result of null/empty input? -> Assume valid.
  - What kind of characters will be in the input? -> Assume any char.

# Approach:
  - Use a stack and push all opening braces and brackets onto it.
  - When encountering a closing brace or bracket:
    - Ensure the stack is not empty,
    - That the top of the stack is the same type: brace or bracket (round/square).
    - If so, pop and continue.
    - If not, return false.
    - At the end we need to ensure that the stack is empty!

# Runtime Analysis:
##Definitions:
  - Let n be the length of the string.

##Overall:
  - Space: O(n) to store all opening brackets, which can be the entire string.
  - Time: O(n) since we go through the string once.

# Tags: Easy, Strings, Stack, Linear

# Notes:
  - Need to ensure the stack is empty at the end.