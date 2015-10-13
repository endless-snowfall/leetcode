# Problem:
  Merge Sorted Array
  
  Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

  Note:
  You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
  
# Clarifications:
  - Can nums1 be null/empty? -> Assume yes.
  - Can nums2 be null/empty? -> Assume yes.
  - Can the length of nums1 be greater than m? -> Assume yes.
  - Can the length of nums2 be greater than n? -> Assume yes.

# Approach:
## Mine:
  - Shift the m elements of nums1 to the right by n positions.
  - Keep track of a read index for both the m elements of num1 (after shifting) and the n elements of nums2.
  - For every position of the result, which will have m + n elements, we want to determine the smaller one.
  - Once we've done that, we want to advance the corresponding source's read index.
  - Once we've finished processing a source array, it's index will go out of valid bounds, we need to trap this situation and use Integer.MAX_VALUE as a default value.

## Concise Solution:
  - Rather than sorting from the head of the arrays and having to worry about shifting existing values in nums1 down or overwriting them, this approach sorts from the tail of the two arrays.
  - The first loop runs so long as neither of the array sources are done process.
  - Then there are two conditional blocks below to drain out one or the other.
  - Logically it's much more clean and straight forward, also removes the need to do shifting and worry about default values.

# Runtime Analysis:
##Definitions:
  - 

##Breakdown:
  - m initial shifts in nums1, O(m)
  - Then O(m) + O(n) writes.

##Overall:
  - Space: Constant
  - Time: O(2m + n).

# Tags: Easy, Arrays, Merge, Gotcha, Review, ArrayOutOfBoundsException, Linear, Shifting, Concise Solution

# Notes:
  - Crazy number of gotcha's.
  - Conditioned the looping without consideration that processing of one input stream could terminate before another.  Had to rework the nums1/2Number assignment to incorporate that check and use Integer.MAX_VALUE as a default assignment.
  - Original writing of the "shifting" loop for nums1 allowed ArrayOutOfBoundsException.  Rewriting it in terms of m, which is guaranteed to be safe within the length of nums1 is more defensive.
  - Shifting algorithm also overwrote elements of interest :(  Need to shift from the tail forward.