# Problem:
  Factorial Trailing Zeroes
  
  Given an integer n, return the number of trailing zeroes in n!.
  Note: Your solution should be in logarithmic time complexity.
  
# Clarifications:
  - Can n be negative or zero? -> Assume yes and the result is 0.

# Approach:
  - Similar to filling out the booleans for the Sieve of Eratosthenes, I would fill out all multiples of 5, 5^2, 5^3, and so on, but within the limits of n.
  - This counts exactly how many 5's will be in the fully expanded prime factorization for each term of the factorial

# Runtime Analysis:
##Definitions:
  - n is the number.
  - k is the log n, base 5.

##Breakdown:
  - We iterate each power of 5 that is still less than the number and count how many multiples there are of that number in n.
  - We add attribute result to the overall result.

##Overall:
  - Space: Constant
  - Time: O(k), base 5

# Tags: Easy, Numbers, Prime Numbers, Tricky, Logarithmic

# Notes:
  - Brutal question, took a lot of writing out of factorials to notice something interesting regarding 5's.
  - At first I wrote out how each term would contribute to the prime factorization of the overall product.
  - It just so happens that the exponent on 5 is the answer.
  - It took a lot of stumbling to find a way to count all the multiples of 5, and squares, cubes of 5 without missing any.