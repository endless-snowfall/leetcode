# Problem:
  Summary Ranges
  
  Given a sorted integer array without duplicates, return the summary of its ranges.

  For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
  
# Clarifications:
  - Are null/empty input valid? -> Assume yes and the result is an empty list.

# Approach:
  - Guard against the edge cases above.
  - Use two variables, one to keep track of the "start" and another for the "end" of a range.
  - We initialize the start and end to be the first element in the array.
  - We then start iterating the array from the second element.
  - For each element of the array we check to see if it is one bigger than the end.
    - If it is, then we update the end, essentially extending the current range.
    - If it is not, then we are about to start a new range and should close out the previous one.
      - Will create a helper to do this and it will ingest the start and end.
      - We then reset the start and end to be the current element.
  - The helper will take a start and end.  There is a special case if start = end.  We would just print "x" instead of "x->y".
  - Be careful to not miss a possible last range when the array terminates.
  
# Runtime Analysis:
##Definitions:
  - n is the size of the array.

##Breakdown:
  - We use two variables so constant space is used.
  - We go through the array once so it's O(n).

##Overall:
  - Space: Constant.
  - Time: O(n)

# Tags: Easy, Arrays, Linear

# Notes:
  - 