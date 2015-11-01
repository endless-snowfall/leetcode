# Problem:
  Combination Sum
  
  Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
  The same repeated number may be chosen from C unlimited number of times.

  Note:
  All numbers (including target) will be positive integers.
  Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
  The solution set must not contain duplicate combinations.

  For example, given candidate set 2,3,6,7 and target 7, 

  A solution set is: 
  [7] 
  [2, 2, 3] 
  
# Clarifications:
  - Are null/input valid? -> Assume yes and the result is an empty list.
  - Could there be no results? -> Assume yes.
  - Is the input array sorted? -> Assume no.
  - Could there be duplicate values in the input array -> Assume yes.

# Approach:
## Common:
  - Guard against the edge cases above.
  - Sort the input.
  
## Approach (1):
  - There are hints of a recursive nature as we use numbers, we kind of have a "new" target to try and achieve using other numbers.
  - We want to loop through all the numbers that are <= the initial target.
  - However, each number that we come across can be:
    - (1) The target, or
    - (2) Less than the target.
  - A number that is less than the target possibly be used multiple times which hints at different execution paths.
  - In fact, we could define a prefix as multiples of the number and recurse to get the possible suffixes.
  - Then we could collect the "list multiplication" as results and return them.
    - By "list multiplication" it means that for each suffix we have, we need to do prefix + suffix.
  
## Approach (2): [Concise]
  - Similar to (1) but uses the Wax On Wax Off technique.
  - We will use a LinkedList for the candidate so adds and removes are O(1).
  - Be careful to make a copy of the candidate/builder list when adding results since the actual candidate will always be empty when the program terminates.

## Approach (3): [Conciser]
  - Allowing the multiplier to be zero actually removes the need for the outer for loop.
  - But the concise solution does away with the concept of a multiplier altogether as we do a two-step recursion for the following:
    - (1) Not use the element and leave the target unchanged, advancing the index.
    - (2) Use the same element again, which is to decrease the target and recurse on the same index.

# Runtime Analysis:
##Definitions:
  - n is the number of entries in the array.
  - d is the number of unique numbers.

##Breakdown:
  - 

##Overall:
  - Space: Unknown
  - Time: Unknown Runtime

# Tags: Medium, Lists, Recursion, Numbers, Unknown Runtime, Concise Solution, WaxOnWaxOff, Gotcha, Linked Lists, Review, Scenario-based Recursion

# Notes:
  - 