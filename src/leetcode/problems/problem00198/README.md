# Problem:
  House Robber
  
  You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

  Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
  
# Clarifications:
  - Is null/empty input valid? -> Assume yes and the result is 0.

# Approach:
## Common:
  - So we know that if the array is null/empty then the result is 0.
  - We also know that if the array is of length 1 then we just return the value of the only element.
  - Know if the array is of length 2 then we just return the max of two elements.
  - In general, really struggled to grasp this problem and took many different approaches.
  
## Approach (1):
  - After destroying my brain, found some way to draw it like a tree with two possible start nodes, being nums[0] or nums[1].
  - After closer inspection, noticed that most nodes, aside from the "earlier" ones have exactly two incoming edges:
    - (1) One from a path involving the house two back (n-2).
    - (2) And another from three back (n-3).
  - Create two arrays to store this information.
  - Loop from index 0 to index n-1, "pushing" the values forward.
    - So at each iteration, evaluate the best path to this node (either from 2 or 3 houses back), then add the value of robbing this house, and push the values forward to two ahead and three ahead.
  - At the end there was some comparison required to determine:
    - Which house should be the last one to rob, the last house or the one before it.
    - And which path was maximal for the largest sum.
    
## Approach (2): [Concise]
  - Took a dynamic programming approach and defined the following recurrence relation:
    - F(n) is the maximum sum achieved after robbing house n.
    - F(n) = max(F(n-2), F(n-3)) + C(n), where C(n) is the value at house n.
  - Then the result is either achieved by either robbing the last or 2nd last house.
  - So return max(F(n-1), F(n-2)).

# Runtime Analysis:
##Definitions:
  - n is the number of houses.

##Breakdown:
  - We only use four variables so constant space.
  - We only go through the array once so O(n).

##Overall:
  - Space: Constant.
  - Time: O(n).

# Tags: Easy, Dynamic Programming, Tricky, Review, Linear, Concise Solution

# Notes:
  -