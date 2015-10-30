# Problem:
  Jump Game
  
  Given an array of non-negative integers, you are initially positioned at the first index of the array.
  Each element in the array represents your maximum jump length at that position.
  Determine if you are able to reach the last index.

  For example:
  A = [2,3,1,1,4], return true.
  A = [3,2,1,0,4], return false.
  
# Clarifications:
  - Are null/empty input valid? -> Assume yes and the result is false.
  - Are arrays of length 1 valid? -> Assume yes and the result is true.

# Approach:
## Approach (1):
  - Use a 1D array to store booleans to indicate whether or not an index is "reachable".
  - Initialize this "reachable" array such that index 0 is reachable -> R[0] = T.
  - Now iterate the entire array and for each index i and jump range j, we want to set all R[i+1..i+j] = T.
  - Then we return whether or not R[nums.length - 1] == T for the result.
  - Turns out this approach times out and it's obvious that we could be doing lots of unnecessary work to reset things that are already reachable.

## Approach (2):
  - Similar to Approach (1) but we don't use the 1D array.  Instead we will only track the max jump range from the current index.
  - We initialize the jumpRange to 0 and we start iterating the input array.
  - At each index, we want to update the jumpRange if necessary.  The jumpRange only needs to be updated if N[i] is greater than it.
  - At the end of each iteration, we want to increase the index but decrease the jumpRange as we are taking a step to move forward.
  - Now if the jumpRange ever reaches 0 then we know that we can't make anymore progress and return false.
  - Based on our definition of the loops, we only need to iterate until the 2nd-last element in the array.  This is because we decrement the jumpRange at the end of the iteration so we know we can reach the next index.

# Runtime Analysis:
##Definitions:
  - n is the length of the array.

##Breakdown:
  - We only track two variables: the index and the range of the max jump from the current index, so the space usage is constant.
  - We also only iterate the array once so the runtime is linear.

##Overall:
  - Space: Constant
  - Time: O(n)

# Tags: Medium, Dynamic Programming, Constant, Better Solution

# Notes:
  - 