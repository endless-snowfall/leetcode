# Problem:
  Maximum Product Subarray
  
  Find the contiguous subarray within an array (containing at least one number) which has the largest product.

  For example, given the array [2,3,-2,4], the contiguous subarray [2,3] has the largest product = 6.
  
# Clarifications:
  - Are null/empty input valid? -> Assume yes and the result is 0.
  - Are single-element input valid? -> Assume yes and the result is that single element.
  - Can the array contain zeroes? -> Assume yes.
  - Can the array contain ones? -> Assume yes.
  - Can the array contain negatives? -> Assume yes.

# Approach:
  - Pretty dry approach which considers a number of special scenarios:
    - (1) 0's are deadly since our product becomes 0 if we use one.  We need to avoid these somehow.
    - (2) 1's are harmless.
    - (3) Negatives are interesting since an even number of them are harmless but an odd number of are not.
  - The idea is to split the array into different disjoint segments were are surround by 0 values.  This is because we simply do not want to use these 0's.
  - Then, considering each segment, we have the following scenarios:
    - (1) There are no negatives or an even number of them.
      - Then we can find the product for this segment range and it is a candidate to replace the result.
    - (2) There are an odd number of negatives:
      - If there was just 1x then the array would look like [a, b, c, -1, d, e, f] and we should consider the larger of [a x b x c] and [d, e, f].
      - If there were 3x then the array would look like [a, b, -1, c, d, -1, e, f] and we should consider the larger of [a x b x -1 x c x d x -1] and [-1 x c x d x -1 x e x f] since those will always be positive numbers.

# Runtime Analysis:
##Definitions:
  - n is the length of the input array.
  - d is the number of 0-bounded segments in the array.
  - m is the average number of elements in each segment.

##Breakdown:
  - We do an O(n) pass to find all the d segments in the array, each time we identify a segment we obtain the start and end indices as well as the number of negative values in that segment.
  - The algorithm does not allow empty segments so neighboring zeroes are treated the same.  d is bounded by O(n/2).
  - For each segment, we find the left-most and right-most negative value indices, if there was only one negative then we would be doing a full O(m) worth of processing.
  - For each segment, we also go through it once to calculate the candidates and range product, taking O(m).
  - Space is constant but we have O(d) candidates.
  - Runtime is O(n) + O(d * 2m) = O(n) + O(2n), since n = dm
  - Overall it's O(3n).

##Overall:
  - Space: Constant
  - Time: O(3n)

# Tags: Medium, Arrays, Math, Review, Linear, Unfinished

# Notes:
  - Code is so, so ugly.