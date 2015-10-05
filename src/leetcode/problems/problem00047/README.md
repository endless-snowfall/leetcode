# Problem:
  Permutations II
  
  Given a collection of numbers that might contain duplicates, return all possible unique permutations.

  For example,
  [1,1,2] have the following unique permutations:
  [1,1,2], [1,2,1], and [2,1,1].
  
# Clarifications:
  - Similar to Problem 46.

# Approach:
  - Use a boolean array to track the usage of elements.
  - We will sort the input.
  - For each level of recursion, we loop through all the characters and use the "unused" ones.
  - The unvisited characters are used in the following way:
    - One character is appended to the growing permutation and it is immediately we mark it as "used".
    - We then make a recursive call, noting that the same character will not be used for any subsequent recursion, as per the "used" array.
    - Once we've returned to the same recursive level, the character is marked as "unused" and removed from the growing permutation
    - We then move onto the next "unused" character.
  - NOTE: 
    - We avoid duplicates by leveraging the sorted input and the "used" array.
    - Since the array is sorted, the first unique element that we process will be used in the permutation.
    - However, subsequent ones will only be used after we know the one before it has already been applied, thereby avoiding duplicate permutation prefixes.

# Runtime Analysis:
##Definitions:
  - n is the size of the array.

##Overall:
  - Space: O(n) intermediate list to hold the growing permutation.
  - Space: O(n) boolean array to track what elements have been used in the current permutation.
  - Time: O(n!).

# Tags: Medium, Arrays, Recursion, Cheated, Tricky, Sorting, Review, Investigate

# Notes:
  - Code and approach are very non-intuitive.
  - Wraps recursive calls inside a loop but leverages a boolean array to control the iterations and avoid duplicate permutation prefixes.