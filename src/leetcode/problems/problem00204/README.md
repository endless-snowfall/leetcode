# Problem:
  Count Primes
  
  Count the number of prime numbers less than a non-negative number, n.
  
# Clarifications:
  - Is 0 or 1 a prime? -> Assume no.
  - Can n be -ve, 0, or 1? -> Assume yes.

# Approach:
  - Implement the Sieve of Eratosthenes.

# Runtime Analysis:
##Definitions:
  - n is the input.

##Overall:
  - Space: O(n) 
  - Time: ?

# Tags: Easy, Arrays, Integer Overflow, Unknown Runtime, Elegant, Review

# Notes:
  - Learned about Arrays.fill(...).
  - Got caught by integer overflow when trying to start from prime * prime.