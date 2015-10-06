# Problem:
  Valid Palindrome
  
  Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

  For example,
  "A man, a plan, a canal: Panama" is a palindrome.
  "race a car" is not a palindrome.

  Note:
  Have you consider that the string might be empty? This is a good question to ask during an interview.

  For the purpose of this problem, we define empty string as valid palindrome.
  
# Clarifications:
  - Are null/empty strings valid input? -> Assume yes.
  - What should the result be for the above? -> Assume true.
  - What if there are no alphanumeric characters? -> Assume true.
  - Does case matter?

# Approach (1):
  - Count the number of alphanumeric characters, n.
  - If there are an even number then the candidate palindrome is centered around two chars.
  - If odd, then around one char.
  - We know that there will be n/2 characters mirrored.
  - Do a pass and push these characters onto a stack.
  - Continue from that point, skipping the middle if necessary, and try to match and pop.

# Runtime Analysis:
##Definitions:
  - n is the number of characters.
  - m is the number of alphanumeric characters.

##Breakdown:
  - O(n) to count alphanumeric characters.
  - O(n) to parse again, while storing O(m/2) characters in a stack.

##Overall:
  - Space: O(m/2)
  - Time: O(n)

# Tags: Easy, Strings, Palindrome, Linear, Stacks, Missing Clarification, Better Solution

# Notes:
  - Asking if the casing matters is important!
  - Since we only care about alphanumeric chars, we need to skip the next one we see if the palindrome is centered around a single character.
  - This is different than simply skipping the next char from where we left off.
  - Consider extracting the alphanumeric chars to reduce noise.