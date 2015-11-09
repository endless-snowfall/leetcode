# Problem:
  Insertion Sort List
  
  Sort a linked list using insertion sort.
  
# Clarifications:
  - Is null input valid? -> Assume yes and the result is null.
  - Is a single element list valid? -> Assume yes and the result is unchanged.

# Approach:
  - Guard against edge cases above.
  - Lots of iffy pointer love in this one.
  - Keep track of a result list which is initialized to be null.
  - Outer Iteration: 
    - We want to iterate the original list and "insert" each node into the result list.
    - In order to make forward progress, we'll immediately keep track of the next node for each iteration.
  - Insertion:
    - We immediately want to disconnect the current node from the list by setting its next to null.
    - Now we check the edge cases of:
      - (1) The result head being null (nothing has been inserted yet).
      - (2) The current node replacing the previous result head.
      - (3) Traversing the entire partial result list (if necessary):
        - (a) If we reach the end then we'll put the new node there (next is null).
        - (b) If we find the next one is larger than the current node then we'll insert it there.
      
# Runtime Analysis:
##Definitions:
  - n is the length of the input list.

##Overall:
  - Space: O(n)
  - Time: O(n^2)

# Tags: Medium, Linked Lists, Sorting, Insertion Sort, Gotcha, Review

# Notes:
  - Got snagged on base cases and cleanly disconnecting the node from the list.