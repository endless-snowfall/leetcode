# Problem:
  Clone Graph
  
  Clone an undirected graph. Each node in the graph contains a label and a list of its neighbors.

  OJ's undirected graph serialization:
  Nodes are labeled uniquely.
  
  We use # as a separator for each node, and , as a separator for node label and each neighbor of the node.
  As an example, consider the serialized graph {0,1,2#1,2#2,2}.
  
  The graph has a total of three nodes, and therefore contains three parts as separated by #.
  
  First node is labeled as 0. Connect node 0 to both nodes 1 and 2.
  Second node is labeled as 1. Connect node 1 to node 2.
  Third node is labeled as 2. Connect node 2 to node 2 (itself), thus forming a self-cycle.
  
  Visually, the graph looks like the following:
  
         1
        / \
       /   \
      0 --- 2
           / \
           \_/

# Clarifications:
  - Is null input valid? -> Assume yes.

# Approach:
## Approach (1): [Recursive]
  - Guard against the edge case above.
  - Create a recursive helper that will take an "original" node and return a "clone" of that node.
  - Use a Map to keep track of the nodes that we've "created" to ensure we terminate.
  - In each recursive call:
    - (1) Check to see if the node has already been created.  If it has then fetch it from the map and return it.
    - (2) Otherwise, create the node and immediately add it to the map.
    - (3) Then we iterate the neighbors of the node and for each one, we add a clone of it, recursing on each neighbor.
  
## Approach (2): [Iterative]
  - Guard against the edge case above.
  - The iterative solution requires a lot more tracking of state:
    - (1) A stack to hold the "original" nodes to process.  The loop will continue so long as this is not empty.
    - (2) A Map to hold the nodes that we've "created" or cloned (also used above).
    - (3) A Set to hold the labels of nodes that are "finished".  This will be used to ensure the algorithm terminates.
  - We start by pushing the root node onto the stack.
  - For every iteration of the outer loop, which terminates when the stack is empty:
    - (1) We pop a node from the stack to process.
    - (2) If this node is already "finished" then we continue to the next.
    - (3) Otherwise, we either create or fetch the node from the "created" map.
    - (4) Then, we iterate the node's neighbors.  For each neighbor:
      - (a) We either create or fetch the neighbor from the "created" map.
      - (b) We add the neighbor clone to our node clone.
      - (c) Then we push the neighbor onto the stack.
    - (5) Once we are done processing all the neighbors for a node, we add that node to the "finished" set.
  
## Approach (3): [Concise Iterative]
  - Did away with the "finished" concept and instead, avoided putting more work on the stack if the neighbor was already previously created.
  
# Runtime Analysis:
##Definitions:
  - n is the number of nodes in the graph.

## Approach (1): [Recursive]
  - Space: O(n) due to stack frames
  - Time: O(n)

## Approach (2): [Iterative]
  - Space: O(n)
  - Time: O(n)

# Tags: Medium, Graphs, Undirected, Recursion, Iterative, Stacks, Linear, Maps, Unfinished, Review

# Notes:
  - [Recursive] Use of a Map to keep track of which nodes were "created" to avoid infinite recursion.
  - [Iterative] Use of the Set to keep track of which nodes were fully processed / completed for the same reason.
  - TODO: Write a helper to create graphs and serialize as well, add more testing.
  - Learned that computeIfAbsent actually returns the value.