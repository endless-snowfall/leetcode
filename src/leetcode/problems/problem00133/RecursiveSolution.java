package leetcode.problems.problem00133;

import java.util.HashMap;
import java.util.Map;

import leetcode.problems.common.UndirectedGraphNode;

public class RecursiveSolution {

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) {
            return null;
        }

        return helper(node, new HashMap<>());
    }

    private UndirectedGraphNode helper(UndirectedGraphNode node, Map<Integer, UndirectedGraphNode> created) {
        if (created.containsKey(node.label)) {
            return created.get(node.label);
        }

        UndirectedGraphNode clone = new UndirectedGraphNode(node.label);
        created.put(node.label, clone);

        for (UndirectedGraphNode neighbor : node.neighbors) {
            clone.neighbors.add(helper(neighbor, created));
        }

        return clone;
    }
}
