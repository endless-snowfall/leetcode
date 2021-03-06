# Problem:
  ZigZag Conversion

  The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
  (you may want to display this pattern in a fixed font for better legibility)

  P   A   H   N
  A P L S I I G
  Y   I   R
  
  And then read line by line: "PAHNAPLSIIGYIR"
  Write the code that will take a string and make this conversion given a number of rows:
  
  string convert(string text, int nRows);
  convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".

# Clarifications:
  - What kind of characters will I encounter?
  - Is there is maximum length?
  - Will there be null or empty input?
  - Will there be nonsensical invocations?

# Approach:
  - Use a StringBuilder for each row that we're building.
  - Create an array to mark each character's index with the row that it belongs to.
  - When iterating the input characters and populating the array, we need to oscillate between
    row 1 and row nRows in the following fashion:
      (1) If we hit 1 then we need to go up after.
      (2) If we hit nRows then we need to go down after.

# Runtime Analysis:
## Definitions:
  - n is the length of the input string.
    
## Breakdown:
  - O(n) to parse the input in a single pass.
  - O(n) for the array that we'll use to hold the index assignment.
  - O(nRows) to store nRows StringBuilders, holding O(n) characters.
  - There is a "pyramid" distribution to how many characters we will anticipate in each row's StringBuilder.
    
## Overall:
  - Space: O(n) + O(n) = O(n)
  - Time: O(n) + O(n) = O(n)

## Tags: Easy, Strings, Input Validation, Linear

## Notes:
  - There are many edge cases concerning the length of the input, and the provided numRows which should lead to either:
      (1) Returning an empty result, or
      (2) Returning the original input