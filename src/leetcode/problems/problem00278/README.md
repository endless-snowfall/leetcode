# Problem:
  First Bad Version
  
  You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

  Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

  You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
  
# Clarifications:
  - Can n = 0 or 1 be valid input? -> Assume yes.
  - What should be returned in those cases?

# Approach:
  - Use Binary Search

# Runtime Analysis:
##Definitions:
  - n is the number of versions.

##Overall:
  - Space: None.
  - Time: O(log n).

# Tags: Easy, Assumptions, Arrays, Search, Binary Search, Logarithmic

# Notes:
  - When updating the mid, don't forget to add the "delta" to the "start" variable.