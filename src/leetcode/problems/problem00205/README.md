# Problem:
  Isomorphic Strings
  
  Given two strings s and t, determine if they are isomorphic.

  Two strings are isomorphic if the characters in s can be replaced to get t.
  
  All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same   character but a character may map to itself.
  
  For example,
  Given "egg", "add", return true.
  Given "foo", "bar", return false.
  Given "paper", "title", return true.
  
  Note:
  You may assume both s and t have the same length.
  
# Clarifications:
  - Can s and t both be null/empty? -> Assume yes and the result is true.

# Approach:
  - Guard against edge cases above.
  - Use a Map to keep track of what we've mapped character of S to in T.
  - Use a Set to keep track of the characters in T that we've mapped.
  - We go through the characters of S and:
    - If we've mapped the character in S, then we ensure that at the same index in T is what we've mapped.
    - If we haven't mapped the character in S yet, then we need to ensure that the corresponding character in T also hasn't been mapped.
      - If that passes then we map the character.
  - If we can process all character of S without problem then we return true.

# Runtime Analysis:
##Definitions:
  - n is the length of S and T.
  - ds is the number of distinct characters in S.

##Breakdown:
  - Our map will have O(d) k, v pairs (entries).
  - Our set will also have O(d) elements.
  - As the interaction with the data structures are O(1) and we process S and T once, the runtime is O(n).

##Overall:
  - Space: O(d).
  - Time: O(n).

# Tags: Easy, Strings, Maps, Sets, Gotcha, Linear

# Notes:
  - Got caught by not checking if the T character was already mapped.