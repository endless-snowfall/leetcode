# Problem:
  Palindrome Linked List

  Given a singly linked list, determine if it is a palindrome.

  Follow up:
  Could you do it in O(n) time and O(1) space?

# Clarifications:
  - Can the list the empty or null? 
  
# Approach:
  - Go through the list once to count how many digits there are.
  - Go through the first half of the list again and build another list reversed.
  - Remove the additional digit if there is an odd number of digits.
  - Compare the reversed list of the first half of the digits with the remainder of the original.
  
# Runtime Analysis:
##Definitions:
  - n is the number of digits.
  
##Overall:
  - Space: O(1) as we are not creating any new ListNode's.
  - Time: O(n) as we only do two linear passes of the list.

# Tags: Easy, Linked List, Palindrome, Linear

# Notes:
  - Be careful of what you're comparing in the end because the "remainder" of your original list must have the correct pointer to the start of the remainder.