package leetcode.problems.common;

import java.util.List;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UndirectedGraphNode {

    @NonNull public Integer label;
    public List<UndirectedGraphNode> neighbors;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(label);
        neighbors.forEach(neighbor -> builder.append(',').append(neighbor.label));
        builder.append('#');
        neighbors.forEach(neighbor -> builder.append(neighbor));
        return builder.toString();
    }
}
