# Problem:
  Graph Valid Tree
  
  Given n nodes labeled from 0 to n - 1 and a list of undirected edges (each edge is a pair of nodes), write a function to check whether these edges make up a valid tree.

  For example:
  
  - Given n = 5 and edges = [[0, 1], [0, 2], [0, 3], [1, 4]], return true.
  - Given n = 5 and edges = [[0, 1], [1, 2], [2, 3], [1, 3], [1, 4]], return false.

  Hint:
  Given n = 5 and edges = [[0, 1], [1, 2], [3, 4]], what should your return? Is this case a valid tree?
  According to the definition of tree on Wikipedia: “a tree is an undirected graph in which any two vertices are connected by exactly one path. In other words, any connected graph without simple cycles is a tree.”
  
  Note: you can assume that no duplicate edges will appear in edges. Since all edges are undirected, [0, 1] is the same as [1, 0] and thus will not appear together inedges.
  
# Clarifications:
  - Is a negative value of n valid? -> Assume no.
  - Is zero a valid value of n? -> Assume yes and it is the empty tree.
  - Are null/empty values of edges valid? -> Assume yes and it is the empty tree.

# Approach:
  - Guard against the edge cases above.
  - We want to start from an arbitrary node and see if we can "reach" the other nodes without seeing a cycle.
  - We'll start arbitrarily with node 0.
  - We'll need to keep track of all the nodes that we've visited.
  - We'll also use a Queue to keep track of the nodes that are queued, initializing it with node 0.

# Runtime Analysis:
##Definitions:
  - n is the number of nodes in the graph.
  - e is the number of undirected edges.

##Breakdown:
  - O(n) space for tracking visited nodes.
  - O(n) space for tracking nodes to process.

##Overall:
  - Space: O(2n)
  - Time: O(n)

# Tags: Medium, Trees, Graphs, Queues, Sets

# Notes:
  - 