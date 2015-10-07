# Problem:
  Best Time to Buy and Sell Stock
  
  Say you have an array for which the ith element is the price of a given stock on day i.

  If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
  
# Clarifications:
  - Are null/empty arrays allowed?
  - Can you buy and sell just one stock?
  - Is an array of size 1 allowed?

# Approach:
##Approach (1): Naive
  - Naive solution is to consider each day a buying day.
  - Now for each day we want to find the highest stock price after that day.
  - O(n^2)
  
##Approach (2): Smarter
  - Guard against the edge cases.
  - Keep track of a result, min, and max.
  - Initialize the result to be zero, and the min and max to be the stock price on the first day.
  - Each time we see a higher value than the max, we want to update it.
  - Each time we see a lower value than the min, we want to start a new "chapter".
  - We want to calculate a candidate price for the max and min seen until this point, overriding if greater than the result.
  - Then we want to reset the min to be this new low price, and also for now the max to be the same.
  - We want to do this computation at the end of the array as well.

# Runtime Analysis:
##Definitions:
  - n is the size of the input.

##Overall:
  - Space: Constant.
  - Time: O(n)

# Tags: Medium, Arrays, Tricky, Linear, Review

# Notes:
  - Having to do duplicate logic on separate triggers: (1) Encountering a new min, and (2) Arriving at the end of the array, requires strange re-ordering of the conditional clauses in the loop.