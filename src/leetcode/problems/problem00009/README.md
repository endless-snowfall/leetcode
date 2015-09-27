# Problem:
  Palindrome Number
    
  Determine whether an integer is a palindrome. Do this without extra space.
    
# Clarifications:
  - Are negatives allowed?
  - Can negatives be palindromes? -> Assume NO

# Approach (1):
  - Count the number of digits there are.
  - Process half the digits of the original integer, removing them as we go along.
  - Build the half that we processed in reverse and compare it at the end.
  - MAX_INT is 2.150B, so it can only have 10 digits.

# Runtime Analysis (1):
## Definitions:
  - n is the number of digits.

## Breakdown:
  - O(n) to count the number of digits
  - O(n/2) to process half the digits
  - O(n/2) space to hold half the digits
  - O(1) comparison to see if we've build the same thing.
        
## Overall:
    Space: O(n/2)
    Time: O(n)

# Approach (2):
  - Negative numbers are not palindromes.
  - Count the number of digits but while doing so build a number to extract left-most digit.
  - Calculate the number of digits to compare (number of iterations).
  - Pick off left-most and right-most digits, updating the number and ALSO the extraction number as you go.
  - If all digits match then it's a palindrome.
    
# Runtime Analysis (2):
## Definitions:
  - n is the number of digits.

## Breakdown:
  - O(n) to count the number of digits
  - O(n/2) to process each pair of digits
        
## Overall:
  - Space: O(1)
  - Time: O(n)

# Tags: Palindrome, Integers, Linear, Assumptions, Divide by Zero, Disappearing Zeroes, Tricky, Unfinished

# Notes:
  - Solution (2) suffered from Divide by Zero with encapsulated zeroes.
  - If a series of zeroes is encapsulated (1000000001), then there will come a point where the working number becomes zero after stripping off the digits.
  - Still need to submit a solution that uses no extra space.
