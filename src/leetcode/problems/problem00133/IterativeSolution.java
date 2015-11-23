package leetcode.problems.problem00133;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import leetcode.problems.common.UndirectedGraphNode;

public class IterativeSolution {

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) {
            return null;
        }

        Stack<UndirectedGraphNode> stack = new Stack<>();
        stack.push(node);
        return helper(stack, new HashMap<>(), new HashSet<>());
    }

    private UndirectedGraphNode helper(
        Stack<UndirectedGraphNode> stack,
        Map<Integer, UndirectedGraphNode> created,
        Set<Integer> finishedNodes)
    {
        UndirectedGraphNode result = null;

        while (!stack.isEmpty()) {
            UndirectedGraphNode current = stack.pop();
            if (finishedNodes.contains(current.label)) {
                continue;
            }

            UndirectedGraphNode clone = getClone(current.label, created);
            if (result == null) {
                result = clone;
            }

            for (UndirectedGraphNode neighbor : current.neighbors) {
                UndirectedGraphNode neighborClone = getClone(neighbor.label, created);
                clone.neighbors.add(neighborClone);
                stack.push(neighbor);
            }

            finishedNodes.add(current.label);
        }

        return result;
    }

    private UndirectedGraphNode getClone(int label, Map<Integer, UndirectedGraphNode> createdNodes) {
        return createdNodes.computeIfAbsent(label, UndirectedGraphNode::new);
    }
}
