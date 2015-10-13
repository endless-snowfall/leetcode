# Problem:
  Count and Say
  
  The count-and-say sequence is the sequence of integers beginning as follows:
  1, 11, 21, 1211, 111221, ...

  1 is read off as "one 1" or 11.
  11 is read off as "two 1s" or 21.
  21 is read off as "one 2, then one 1" or 1211.
  Given an integer n, generate the nth sequence.

  Note: The sequence of integers will be represented as a string.
  
# Clarifications:
  - Is non-positive input valid? -> Assume no.

# Approach:
  - Straightforward looping as we need to generate the nth term.
  - Will reuse a StringBuilder to build intermediate results.
  - Will also use variables to keep track of the digit and the digitCount.
  - Will need two loops, outer loop is bounded by n, and inner loop is bounded by the length of the intermediate result.

# Runtime Analysis:
##Definitions:
  - 

##Breakdown:
  - 

##Overall:
  - Space: Constant
  - Time: O(n)

# Tags: Easy, Numbers, Strings, Gotcha, Bad Assumptions

# Notes:
  - Made a bad assumption surrounding the input.  Badly assumed that for 2, the starting number would be 2 and we want to return the 2nd term of the sequence.
  - In fact there is only one sequence which starts from "1" and we are just generating until the nth term.