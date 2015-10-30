# Problem:
  Group Anagrams
  
  Given an array of strings, group anagrams together.

  For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
  Return:
  
  [
    ["ate", "eat","tea"],
    ["nat","tan"],
    ["bat"]
  ]
  
  Note:
  For the return value, each inner list's elements must follow the lexicographic order.
  All inputs will be in lower-case.
  
# Clarifications:
  - Are null/empty input valid? -> Assume yes and the result is an empty list.

# Approach:
  - Want to keep a Map of String -> List<String> where:
    - The keys are a String which represent a sorted anagram.  Anagrams contain the same letters and occurrence count of each letter and when you sort them they are identical.
    - The values a group of anagrams.
  - As we process the original array we need to convert each anagram into a key by sorting the characters.
  - We will either create a new group or retrieve the existing group for that key.
  - Then we will add a new anagram to the group.
  - At the end, we will go through each group and sort it, add the sorted group into the result list.

# Runtime Analysis:
##Definitions:
  - n is the number of strings in the input array.
  - m is the average number of characters in each anagram.
  - o is the average number of groups.
  - p is the average number of anagrams in each group (n/o).

##Breakdown:
  - O(m log m) to sort each anagram and derive a key.
  - O(m) to create a String for each key.
  - O(1) to retrieve the group for a given key.
  - O(1) to add the new anagram to the group.
  - O(n) strings to process.
  - O(n (m log m + m))
  - O(p log p) to sort each group.
  - O(o (p log p)) to sort all groups.

##Overall:
  - Space: O(o * p)
  - Time: O(n (m log m + m)) + O(o (p log p))

# Tags: Medium, Lists, Maps, Strings, Sorting, Quadratic

# Notes:
  - 