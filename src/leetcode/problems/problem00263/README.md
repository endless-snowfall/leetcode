# Problem:
  Ugly Number
  
  Write a program to check whether a given number is an ugly number.

  Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.

  Note that 1 is typically treated as an ugly number.
  
# Clarifications:
  - Negative numbers (and zero) are not ugly?

# Approach:
  - Guarding against above input, and ensuring that 1 is ugly.
  - If x is ugly then there exists some 2^a * 3^b * 5^c such that 1 = n / 2^a * 3^b * 5^c,
    where a, b, c >= 0.
  - Create a helper to process a given number against a base.
  - This helper will:
    - Divide the number by the base as many times as it can and return the remainder.
  - If at any time, the number reaches 1 then we should stop and return 1.
  - At the end we ensure the remainder of everything is 1.

# Runtime Analysis:
##Definitions:
  - n is the number.
  - a is the most times 2 can be divided into n.
  - similarly b is for 3.
  - similarly c is for 5.

##Breakdown:
  - O(a) + O(b) + O(c) for numbers that are not negative or 1.

##Overall:
  - Space: None.
  - Time: O(a+b+c);

# Tags: Easy, Numbers, Prime Numbers, Factorization, Linear, Condensed

# Notes:
  - 