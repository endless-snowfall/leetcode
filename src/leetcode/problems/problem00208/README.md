# Problem:
  Implement Trie (Prefix Tree)
ß
  Implement a trie with insert, search, and startsWith methods.

  Note:
  You may assume that all inputs are consist of lowercase letters a-z.

# Clarifications:
  - Are null/empty strings valid input for any of the three methods?
    - Assume that null is not but empty is.
  - Are there any runtime requirements or desired optimizations for certain methods?
  - Are there space/time restrictions?

# Approach:
  - Each TrieNode will hold a string prefix character, which for the root will be an empty character/string.
  - Additionally, each TrieNode could possible have children which will be stored in a map.  The map will be structured so that the "next" character is mapped to the TrieNode.
  - Each TrieNode will also have a flag to indicate whether or not it is a word.  This is because some prefixes for other words may be words themselves therefore intermediate nodes could be words, not necessarily just the leaves of the trie.
  - Regarding the structure of the Trie:
    - The root will represent the empty string prefix.
    - The length of a parent node's prefix and its child's prefix will differ by exactly 1 character.

# Runtime Analysis:
##Definitions:
  - n is the size of the trie.

##Breakdown:
  - insert:
    - Space: 
      - We will be creating a maximum of O(n) nodes, where n is the number of characters of the new word.
      - However, if there is already a common prefix of m characters then we will only create O(n-m) new nodes.
      - Since we are storing the children in a HashMap, the check to see if a child exist and retrieving a child is O(1).
    - Time:
      - Overall time is O(n) since we need to go through all the characters of the new word.

  - search:
    - Space:
      - We use constant space to traverse the tree.
    - Time:
      - If we find the word then we will find a node for each character of the word, O(n).

  - startsWith: 
    - Space:
      - We use constant space to traverse the tree.
    - Time:
      - We need to process the entire prefix in the worst case, O(n).

##Overall:
  - insert:
    - Space: O(n)
    - Time: O(n)

  - search:  
    - Space: Constant
    - Time: O(n)

  - startsWith:  
    - Space: Constant
    - Time: O(n)

# Tags: Medium, Trees, Tries, Design, Strings, Iterative, Linear

# Notes:
  - 