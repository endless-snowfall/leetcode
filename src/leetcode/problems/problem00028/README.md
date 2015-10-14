# Problem:
  Implement strStr()
  
  Implement strStr().

  Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

  Update (2014-11-02):
  The signature of the function had been updated to return the index instead of the pointer. If you still see your function signature returns a char * or String, please click the reload button  to reset your code definition.
  
# Clarifications:
  - Can the needle be null? -> Assume yes and the result is -1.
  - Can the needle be empty? -> Assume yes and the result is 0 
  - Can the haystack be null? -> Assume yes and the result is -1.
  - Can the haystack be empty? -> Assume yes and the result is -1 unless the needle is empty.
  - Does the needle have to exist in haystack? -> Assume no.
  
# Approach:
  - Pretty simplistic approach.
  - Guard against the edge cases above.
  - Store the first character of needle somewhere, we'll be using this a lot.
  - Go through the characters of haystack comparing them with the first character of needle, we'll bound this loop by haystack.length() - needle.length() so we don't bother checking the starting character when we know needle can't fit.
  - If we find a match, we want to check forward to see if every character after that matches needle.
    - If it does, we'll return the index.
    - If it doesn't, we'll increase the read index.
  - If the character doesn't match the first char of needle then we'll increase the read index.
  - If we terminate the loop then we'll return -1.

# Runtime Analysis:
##Definitions:
  - m is the length of haystack.
  - n is the length of needle.
  - o is the average number of occurrences of the first character of needle.

##Breakdown:
  - We know that we need to go through all the characters of haystack looking for a first character match with needle.
  - This will take O(m) time.
  - However, each time we come across a match we'll check O(n) characters of needle.
  - Therefore we'll average O(m + o * n) time.

##Overall:
  - Space: Constant.
  - Time: O(m + o * n).

# Tags: Easy, Strings, Gotcha, Linear

# Notes:
  - I bounded the loop incorrectly as it was < but corrected to <=.
  - I created a helper to try and skip faster than one character but it was an incorrect approach.