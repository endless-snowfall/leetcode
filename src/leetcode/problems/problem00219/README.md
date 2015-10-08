# Problem:
  Contains Duplicate II
  
  Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.
  
# Clarifications:
  - Are null/empty input valid? -> Assume yes.
  - Are -ve, zero values of k valid? -> Assume yes.

# Approach (1):
  - Guard against edge cases.
  - Keep a window list of size k elements.
  - When populating this window list, ensure there are no duplicates.
  - Process the rest of the list and for each element:
    - If it's already in the list -> there's a duplicate.
    - Otherwise, remove the first element from the window and add the element onto the end.

# Runtime Analysis (1):
##Definitions:
  - n is the size of the input array.

##Breakdown:
  - We need O(k) space to hold the window.
  - We need to do (n) for one linear process of the array.
  - For each element we process we need to check O(k) elements for containment.
  - Overall time is O(nk).

# Approach (2):
  - Same as (1) but use a HashSet to hold the window instead of a list.
  - Yields O(1) lookup instead of O(k).  We know that those number should be unique so order is not necessary.

##Overall:
  - Space: O(k)
  - Time: O(n)

# Tags: Easy, Arrays, Timed Out, Better Solution, Reworked, Linear, Bad Assumption

# Notes:
  - If the window is the size of the entire list then we have a problem.  We are essentially doing 1 + 2 + 3 + 4 + ... + n checks, which is O(n^2).
  - Bad looping conditions mixing up i and k.
  - Made a bad assumption for input of k=0.