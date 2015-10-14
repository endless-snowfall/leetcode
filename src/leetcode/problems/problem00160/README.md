# Problem:
  Intersection of Two Linked Lists
  
  Write a program to find the node at which the intersection of two singly linked lists begins.
  
  
  For example, the following two linked lists:
  
  A:          a1 → a2
                     ↘
                       c1 → c2 → c3
                     ↗            
  B:     b1 → b2 → b3
  
  begin to intersect at node c1.
  
  Notes:
  If the two linked lists have no intersection at all, return null.
  The linked lists must retain their original structure after the function returns.
  You may assume there are no cycles anywhere in the entire linked structure.
  Your code should preferably run in O(n) time and use only O(1) memory.
  
# Clarifications:
  - Is null input valid? -> Assume yes and the result is null.

# Approach:
  - Guard against the edge cases above.
  - There's an interesting observation once we know the lengths of each list.
  - For the longer list with length m, and the shorter list with length n, we know that the intersection cannot exist in first m-n nodes of the longer list.  If it did, then we would have a shorter list of length longer than n, which is a contradiction.
  - We will calculate the length of each list, which will take O(m) and O(n) time respectively.
  - If the lengths of the list are the same there we don't advance either of the pointers.
  - We will track a pointer for each list.
  - We will advance the pointer for the longer list by m-n positions.
  - We will then compare each element from that point to look for an intersection for the possibly "overlapping" portion of the lists:
    - If we find a match then return the element.
    - If we don't, then advance each pointer until we can't anymore.
  - If we didn't return an element at this point then we'll return null.

# Runtime Analysis:
##Definitions:
  - m is the length of the longer list.
  - n is the length of the shorter list.

##Breakdown:
  - O(m) to count the length of the longer list.
  - O(n) to count the length of the shorter list.
  - Another O(n) pass through both lists.
  - No additional storage is used aside from constant storage for the next node.

##Overall:
  - Space: Constant.
  - Time: O(m + 3n).

# Tags: Easy, Linked List, Intersection, Review, Linear

# Notes:
  - 