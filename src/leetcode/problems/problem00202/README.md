# Problem:
  Happy Number
  
  Write an algorithm to determine if a number is "happy".

  A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

  Example: 19 is a happy number

  12 + 92 = 82
  82 + 22 = 68
  62 + 82 = 100
  12 + 02 + 02 = 1
  
# Clarifications:
  - Can n be negative or zero? -> Assume yes and result is false.

# Approach:
  - Use a Set to keep track of numbers that we've seen.
  - Keep looping until the number is not 1, if we exit this loop then we will return true as the result.
  - Inside the loop, check if the number has been seen already.
  - If it has, then return false as the result.
  - If it hasn't, then add it to the set.
  - Now we need to reassign the number to be the sum of the digits, which we'll make a helper method to compute.

# Runtime Analysis:
##Definitions:
  - 

##Breakdown:
  - Not sure if we can quantify the runtime.

##Overall:
  - Space: ?
  - Time: ?

# Tags: Easy, Numbers, Sets, Unknown Runtime

# Notes:
  - 