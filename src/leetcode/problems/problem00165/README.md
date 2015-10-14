# Problem:
  Compare Version Numbers
  
  Compare two version numbers version1 and version2.
  If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.
  
  You may assume that the version strings are non-empty and contain only digits and the . character.
  The . character does not represent a decimal point and is used to separate number sequences.
  For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second   first-level revision.
  
  Here is an example of version numbers ordering:
  
  0.1 < 1.1 < 1.2 < 13.37
  
# Clarifications:
  - Will the input always contain a "."? -> Assume no.
  - Will the versions always have a major version? -> Assume no.
  - Will the versions always have a minor version? -> Assume no.
  - Do the versions have leading zeroes when applicable? -> Assume not necessarily.
  - Can the versions have unnecessarily padded zeroes? -> Assume yes.
  - Can the different versions have a different level of granularity? -> Assume yes.

# Approach:
## Approach (1):
  - Brutal approach avoiding String.split.
  - Don't do this at home kids.
  
## Approach (2):
  - Used String.split but there is a weird case when dealing with ".1", it creates an empty string entry in the result array.
  - Had to guard against this.
  - Otherwise quite straight forward, we iterate on the longest array length and guard against one array possibly going out of bounds, in which case we would say that version component is 0.

# Runtime Analysis:
##Definitions:
  - m is the length of version1.
  - n is the length of version2.
  - md is the number of components of version1.
  - nd is the number of components of version2.
  - x is the average length of a component in characters.

##Breakdown:
  - Had to do String.split for both versions, not really sure what the runtime is, assume O(m) + O(n).
  - Incurred space usage of O(md) + O(nd).
  - Will loop a maximum of O(max(md, nd)) times and at each time we will possibly have to convert two strings into numbers, taking O(2x) time.

##Overall:
  - Space: O(md + nd).
  - Time: O(m + n) + O(max(md, nd) * x).

# Tags: Easy, Strings, Concise Solution, Unknown Runtime

# Notes:
  - Brutal edge cases.
  - Initial Approach (1) attempted to avoid usingString.split and the result was horrible code that was tricky to get right.
  - Used String.split for Approach (2) and the code was much cleaner.