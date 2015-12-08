# Problem:
  Sort List
  
  Sort a linked list in O(n log n) time using constant space complexity.
  
# Clarifications:
  - Is null input valid? -> Assume yes and the result is null.
  - Is single-node input valid? -> Assume yes and the result is the same as the input.

# Approach:
  - Use MergeSort to accomplish this.
  - First we find the length of the entire list.
  - Create a recursive helper that takes:
    - (1) The head of a sublist
    - (2) The length of the sublist
  - For each recursive call we:
    - (1) Check if the length is zero -> return null.
    - (2) Check if the length is one -> return that node.
    - Otherwise, we find the mid of the length and split the input list into two sublists.
    - Then we make a recursive call for each sublist.
    - Then we "merge" the two lists together.

# Runtime Analysis:
##Definitions:
  - n is the length of the input list.

##Breakdown:
  - We calculate the length once by doing a O(n) pass.
  - We do O(n) merges and O(n) splits at each level of recursion.
  - There are log(n) levels.
  - A merge takes O(n) time.

##Overall:
  - Space: Constant
  - Time: O(n log n)

# Tags: Medium, Sort, Sorting, Merge Sort, Dummy Node, Linearithmic, Unfinished

# Notes:
  - Learned the "dummy node" technique.
  - StackOverflowed before by trying to calculate the length of the list using recursion.
  - TODO: QuickSort solution