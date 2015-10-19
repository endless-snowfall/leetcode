# Problem:
  Nim Game
  
  You are playing the following Nim Game with your friend: There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones. The one who removes the last stone will be the winner. You will take the first turn to remove the stones.

  Both of you are very clever and have optimal strategies for the game. Write a function to determine whether you can win the game given the number of stones in the heap.

  For example, if there are 4 stones in the heap, then you will never win the game: no matter 1, 2, or 3 stones you remove, the last stone will always be removed by your friend.

# Clarifications:
  - None.

# Approach:
## Approach (1):
  - Approached this initially with a 1D dynamic programming approach.
  - We will use a boolean array to store the possibility of winning for the person who starts the game first.
  - The index of the array represents the number of stones at the start of the game.
  - I know the first three states of the game: 1:T, 2:T, 3:T
  - Now for n=4, from the perspective of the person who starts the game, he has no chance of winning.
    - This is because for n-3, n-2, n-1, the other player has no chance of losing.
    - So 4:F
  - Repeating this for every value up to n and building up the array we can get the answers.

## Approach (2):
  - Noticed something interesting in the array values, they repeat as T, T, T, F
  - So basically if n % 4 == 0, the person who starts the game will always lose.

# Runtime Analysis:
##Definitions:
  - None.

##Overall:
  - Space: None.
  - Time: O(1).

# Tags: Easy, Zero-Sum Game, Dynamic Programming, Tricky, Review, Constant

# Notes:
  - 