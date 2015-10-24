# Problem:
  3Sum
  
  Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

  Note:
  Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
  The solution set must not contain duplicate triplets.
    For example, given array S = {-1 0 1 2 -1 -4},

    A solution set is:
    (-1, 0, 1)
    (-1, -1, 2)
  
# Clarifications:
  - Will there always be at least one triplet? -> Assume no.
  - Are null/empty input valid? -> Assume yes.
  - Is an array with less than 3 elements valid input? -> Assume yes.

# Approach:
  - Guard against the edge cases above.
  - Sort the input array.
  - Now we'll need a bound for an outer loop which fixes the index for a.
    - This loop should go from 0..length - 3 since we need two pointers for b and c.
  - From the relationship, a + b + c = 0, we know the following:
    - (1) Either a = b = c = 0, OR a < 0 and c > 0.
    - (2) That means a cannot be greater than 0 and c cannot be less than 0.
      - Guard against these edge cases.
  - Whenever we choose choose the next a value, we want to choose a unique one.
  - Whenever we fix on an a value, we set b to be the index to the right of a, and c to be at the end of the array.
  - Because the array is sorted:
    - (1) a + b + c could be over the target, which means we need to make the value smaller -> try a lower c value.
    - (2) we could be under the target, so we need to make it bigger by advancing b.
    - (3) we met our target, now we can advance b and retreat c to continue looking for others.
  
  - Integer overflow:
    - We know because a <= 0 and c >=0 we know that a + c can never overflow.
    - Since a + b + c = 0 is our target, a + c = -b, OR -(a + c) = b.
    - However, a + c could equal Integer.MIN_VALUE we need to guard against this case to avoid overflow.

# Runtime Analysis:
##Definitions:
  - n is the size of the input array.
  - d is the number of distinct numbers in the input.
  - t is the number of triplets in the answer.

##Breakdown:
  - O(n log n) to sort the entire array.
  - We only consider each unique number once for a, so the outer loop is bounded by O(d).
  - For each a, we consider at most O(d) values of b and c.

##Overall:
  - Space: O(t)
  - Time: O(n log n) + O(d^2) -> O(d^2)

# Tags: Medium, Arrays, Integer Overflow, Sorting, Quadratic

# Notes:
  - It was tricky to understand how to deal with avoiding duplicate triplets.
  - It's obvious that there has to be some skipping of duplicate elements involved but when to do it was not obvious.
  - The approach was to allow a, b, and c to rest on the same values but once we move any of them we don't allow duplicates to be selected.
  - [0, 0, 0, 0] and [0, 0, 0] were good base cases to illustrate this.