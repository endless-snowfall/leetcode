# Problem:
  Generate Parentheses
  
  Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

  For example, given n = 3, a solution set is:

  "((()))", "(()())", "(())()", "()(())", "()()()"
  
# Clarifications:
  - Can n <=0? -> Assume yes and the result is an empty list.

# Approach:
## Approach (1):
  - Non-optimal repeated duplicate result generation using a Set to save yourself at each step.
  - Simply tried to insert "()" into every index of partial solutions.
  
## Approach (2): [Concise]
  - Multiple steps of refactoring and iterations led to this solution.
  - At first, tried to do too much work at each recursive step (R[m, n], where m is numOpenRemaining, and n is numCloseRemaining).
    - Tried to use between 0 to m opens, each time following it with a close.  Recursing this way caused the tree to be "top-heavy".
  - There exists an interesting observation in that m <= n:
    - At the start m == n because we haven't used anything.
    - if we used a close first, then the string would be incorrect.
  - Working with Danny, managed to simplify the work done at each recursive step and do less.
  
# Runtime Analysis:
##Definitions:
  - n is the number of pairs

##Breakdown:
  - 

##Overall:
  - Space: 
  - Time: O(4^n / n 3/2)

# Tags: Medium, Tricky, Review, Recursion, Danny, Top Heavy, Unfinished, Unknown Runtime, Exponential, Catalan Numbers

# Notes:
  - Learned about Catalan Numbers and how it relates to moving left/right on a grid question.