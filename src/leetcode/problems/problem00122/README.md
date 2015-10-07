# Problem:
  Best Time to Buy and Sell Stock II
  
  Say you have an array for which the ith element is the price of a given stock on day i.

  Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).

# Clarifications:
  - Similar to Problem 121.

# Approach:
  - Reset the new chapter when we see any value lower than the current max.
  - Instead of having one result, we attribute a value to the result.
  - This represents the difference of being able to buy and sell just one stock (B+S Stock I) and the current problem where we can do many serialized transactions.
  
# Runtime Analysis:
##Definitions:
  - n is the size of the input.

##Overall:
  - Space: Constant.
  - Time: O(n)

# Tags: Medium, Arrays, Tricky, Linear

# Notes:
  - Main difference is to terminate the "chapter" differently.
  - In B+S Stock I, we terminated the chapter when we saw a lower min.
  - In B+S Stock II, we terminate when we see any value lower than the current max.