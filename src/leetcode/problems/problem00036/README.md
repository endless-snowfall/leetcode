# Problem:
  Valid Sudoku
  
  Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
  The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
  A partially filled sudoku which is valid.

  Note:
  A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
  
# Clarifications:
  - Can the matrix be null? -> Assume yes and the result is false.
  - Can the dimensions be different than 9x9? -> Assume no.

# Approach:
  - Guard against the edge cases above.
  - Going to need to check three rules for each element:
    - (1) Adheres to "row" rule.
    - (2) Adheres to "column" rule.
    - (3) Adheres to "box" rule.
  - Going to store a set of characters for each row, column, box to ensure we exit with a false result early.  These sets will be stored in Lists grouped accordingly.
  - Go through each element of the matrix, skipping the empty elements, and check row, column, box for each.
  - We will need to do some math to map the row and column indices appropriately to the set representing the box.
  - Space will take O(3n) since each element could be stored in 3 different sets representing the row, column, and box.
  - Time will also take O(n) since we only go through the matrix once and checks for containment and adds to sets are O(1) amortized.

# Runtime Analysis:
##Definitions:
  - n is the number of items in the matrix.

##Overall:
  - Space: O(3n).
  - Time: O(n).

# Tags: Easy, Sudoku, Matrix, Arrays, Linear

# Notes:
  - 