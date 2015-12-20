package leetcode.problems.problem00261;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution {

    public boolean validTree(int n, int[][] edges) {
        if (n == 0 || edges == null || edges.length == 0 || edges[0].length == 0) {
            return true;
        }

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> nodesToProcess = new LinkedList<>();
        nodesToProcess.add(0);

        while (!nodesToProcess.isEmpty()) {
            int node = nodesToProcess.remove();

            if (visited.contains(node)) {
                return false;
            }
            visited.add(node);

            for (int target = 0; target < edges[node].length; target++) {
                if (edges[node][target] == 1) {
                    edges[node][target] = 0;
                    edges[target][node] = 0;
                    nodesToProcess.add(target);
                }
            }
        }

        return visited.size() == n;
    }
}
