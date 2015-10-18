# Problem:
  House Robber
  
  You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

  Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
  
# Clarifications:
  - 

# Approach:

## Common:
  - So we know that if the array is null/empty then the result is 0.
  - We also know that if the array is of length 1 then we just return the value of the only element.
  - In general I really struggled to grasp this problem and took many different approaches.
  
## Approach (1):
  - I drew out a tree representation of various arrays and discovered that aside from the start nodes, most nodes have two incoming edges to them:
    - (1) One edge from two positions before, meaning the last house was skipped.
    - (2) Another edge from three positions before, meaning the last two houses were skipped.
  - It resembles the stair climbing question which is a derivative of calculating Fibonacci Numbers.
  - So I created two additional arrays to store these intermediate values, one for attributing the current house's stash to a possible "path" of also robbing the house two away, and another for attributing it to a possible "path" of robbing the one three away.
  - Prior to forward attributing, I had to consider the max value for the position I was at, which is the max of taking a path from two/three houses before.
  
## Approach (2): [Concise]
  
# Runtime Analysis:
##Definitions:
  - n is the length of the array.

##Breakdown:
  - 

##Overall:
  - Space: O(2n)
  - Time: O(n)

# Tags: Easy, Dynamic Programming, Tricky, Review, Linear, Concise Solution

# Notes:
  - 