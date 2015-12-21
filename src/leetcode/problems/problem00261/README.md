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
  - What exactly is the format of the input? -> Assume it is an undirected adjacency matrix, which is symmetric.

# Approach:
  - Guard against the edge cases above.
  - We want to start from an arbitrary node and see if we can "reach" the other nodes without seeing a cycle.
  - We will use a Queue to track the nodes that we want to "process".
  - We will use a Set to track the nodes that we have already "processed".
  - The execution will start arbitrarily from node 0 and continue so long as there is work left in the Queue.
  - Each time we "process" a node we will:
    - (1) Check to see if it's already been processed, if so, we will return false as this indicates that there is a cycle since we've found another way to a node that we've visited before.
    - (2) Otherwise, we immediately mark it as visited.
    - (3) We will then identify its neighbors by looking at the corresponding row in the matrix.
    - (4) For every neighbor, we will Queue it up for processing and also "remove" the two corresponding edges in the matrix.
  - The final step is to ensure that we've "seen" all the nodes, which may not be the case if the graph is not connected.
  
# Runtime Analysis:
##Definitions:
  - n is the number of nodes in the graph.

##Breakdown:
  - O(n) space for tracking visited nodes.
  - O(n) space for tracking nodes to process.

##Overall:
  - Space: O(2n)
  - Time: O(n^2)

# Tags: Medium, Trees, Graphs, Queues, Sets, Quadratic

# Notes:
  - Not removing the symmetric edge would cause the false detection of cycles.
  - It's not actually necessary to remove the "forward" edge since we will never allow ourselves to reprocess the same node again.