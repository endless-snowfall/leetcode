package leetcode.problems.problem00133;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import leetcode.problems.common.UndirectedGraphNode;

public class ConciseIterativeSolution {

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) {
            return null;
        }

        Stack<UndirectedGraphNode> stack = new Stack<>();
        stack.push(node);

        HashMap<Integer, UndirectedGraphNode> createdClones = new HashMap<>();
        helper(stack, createdClones);
        return createdClones.get(node.label);
    }

    private void helper(
        Stack<UndirectedGraphNode> stack,
        Map<Integer, UndirectedGraphNode> createdClones)
    {
        while (!stack.isEmpty()) {
            UndirectedGraphNode node = stack.pop();
            UndirectedGraphNode nodeClone = getClone(node.label, createdClones);

            for (UndirectedGraphNode neighbor : node.neighbors) {
                if (!createdClones.containsKey(neighbor.label)) {
                    stack.push(neighbor);
                }

                UndirectedGraphNode neighborClone = getClone(neighbor.label, createdClones);
                nodeClone.neighbors.add(neighborClone);
            }
        }
    }

    private UndirectedGraphNode getClone(int label, Map<Integer, UndirectedGraphNode> createdNodes) {
        return createdNodes.computeIfAbsent(label, UndirectedGraphNode::new);
    }
}
