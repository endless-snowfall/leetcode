# Problem:
  Valid Anagram
  
  Given two strings s and t, write a function to determine if t is an anagram of s.

  For example,
  s = "anagram", t = "nagaram", return true.
  s = "rat", t = "car", return false.

  Note:
  You may assume the string contains only lowercase alphabets.
  
# Clarifications:
  - Is null/empty input valid? -> Assume yes.
  - What kind of characters can we expect?
  - Does casing matter?

# Approach:
  - Guard against nullness and emptiness.
  - Check length, it's a prerequisite for strings being anagrams.
  - Sort both strings and compare them.

# Runtime Analysis:
##Definitions:
  - n is the length of the first string, m the other.

##Breakdown:
  - If we get to the point where we sort then we know the lengths are the same.
  - O(2 * (n log n)) to sort both strings.
  - O(n) to compare sorted strings.
  - Sorting outweighs the comparison.

##Overall:
  - Space: O(n).
  - Time: O(n log n).

# Tags: Easy, Strings, Arrays, Sorting, Linearithmic

# Notes:
  - 