# Problem:
  Letter Combinations of a Phone Number
  
  Given a digit string, return all possible letter combinations that the number could represent.
  A mapping of digit to letters (just like on the telephone buttons) is given below.
  
    Input:Digit string "23"
    Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
  
  Note:
  Although the above answer is in lexicographical order, your answer could be in any order you want.
  
# Clarifications:
  - Are null/empty input valid? -> Assume yes and the result is an empty list.
  - Are strings that consist purely of 0's and 1's valid -> Assume yes and the result is an empty list.

# Approach:
## Approach (1): [Iterative]
  - Build the result from left to right, top-down.
  - Keep track of a growing list of partial results.
  - For each digit of the input, convert it to a collection of letters and make a copy of the partial results for each letter.
    - Append each letter to each copy of the partial results and do the same for the next character.
  - We need to skip the iterations for '0' and '1' digits.
  - Careful that we also need to start off with an empty string in the partial results list the first time we see a non-0 or non-1.
  - Suffers from too much collection copying and string concatenation.
  
## Approach (2): [Concise]
  - This solution represents the mapping as a String instead of a collection, which is more compact.
  - This solution also makes use of a StringBuilder and the WOWO technique to save on string concatenation.

# Runtime Analysis:
##Definitions:
  - n is the number of digits.
  - d is the number of non-0 and non-1 digits

##Breakdown:
  - Each non-0 and non-1 have an average of 3 letters it maps to.
  - Since we are creating permutations of these, we will need to generate 3^d results.
  - It will take at least that much time to do that.

##Overall:
  - Space: O(3^d)
  - Time: O(3^d)

# Tags: Medium, Recursive, StringBuilder, Strings, Permutations, WaxOnWaxOff, Exponential

# Notes:
  - Use of the "Wax On Wax Off" technique and the StringBuilder saves us from a lot of string concatenation.