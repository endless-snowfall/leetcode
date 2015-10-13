# Problem:
  Word Pattern
  
  Given a pattern and a string str, find if str follows the same pattern.

  Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
  
  Examples:
  pattern = "abba", str = "dog cat cat dog" should return true.
  pattern = "abba", str = "dog cat cat fish" should return false.
  pattern = "aaaa", str = "dog cat cat dog" should return false.
  pattern = "abba", str = "dog dog dog dog" should return false.
  Notes:
  You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.
  
# Clarifications:
  - Can the pattern be null? -> Assume yes and the result is always false in this case.
  - Can the pattern be empty? -> Assume yes.
  - Can the string be null? -> Assume yes and the result is always false in this case.
  - Can the string be empty? -> Assume yes and the result is true only if the pattern is empty.
  - Can the string have no letters? -> Assume yes and the result is only true if the pattern is empty.
  - Do the pattern and the string always have a 1:1 correspondence? -> Assume no.

# Approach:
## Common:
  - Guard against the edge cases above.
  - We'll need a map to keep track of the mapping between letters of the pattern and words that we've encountered.
  - We'll need to guard against:
    - (1) Coming across a new mapping.
    - (2) Coming across a mapping we've already encountered.
    - (3) Coming across a pattern character that's already mapped but to another word.
    - (4) Coming across a string word that's already mapped but to another pattern character.
    - (5) When we come across a pattern character but there are no more corresponding string words.
    - (6) When we come across a string word but there are no more corresponding pattern characters.

## Approach (1):
  - Use String.split to tokenize the input string, obtaining a String array, takes O(n) time and O(n) space.  The tokenization also rids us of empty spaces so that our array only consists of non-space words.
  - Check that it equals the length of the pattern:
    - If it does not then return false.
    - If it does then we need to check but we've learned something.
  - Proceed to process both pattern and string using the following scenarios above.
  
## Approach (2):
  - Wing it.
  - Keep track of a pattern read index and string read index.
  - We read a pattern character and then attempt to parse out a word from the string to pair it with.
  - If we run out of pattern characters then there are two scenarios:
    - (1) The string has also run out or only consists of space characters -> result is true.
    - (2) The string has not run out and contains non-space characters -> result is false.
  - If we've secured a pattern character then there are scenarios regarding the string:
    - (1) We're able to secure a word from the string -> check them.
    - (2) We're not able to secure a word from the string -> return false.
  - If we secured both a pattern character and a string word then:
    - We consider the scenarios from above.
  
# Runtime Analysis:
##Definitions:
  - m is the length of the pattern.
  - n is the length of the string.
  - s is the number of characters in the pattern.
  - t is the number of words in the string.

##Breakdown:
  - We parse the pattern once and the string exactly once, so O(m + n) time using s characters and d Strings.

##Overall:
  - Space: O(s) + O(d)
  - Time: O(m + n)

# Tags: Easy, Strings, Maps, Gotcha

# Notes:
  - Forgot to advance the patternIndex :(
  - Didn't guard well against spaces in the string, tangled in conditional blocks, allowed spaces to be appended to the wordBuilder :(