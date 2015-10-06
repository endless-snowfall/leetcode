package leetcode.problems.problem00257;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import leetcode.problems.common.TreeNode;

public class Solution {

    public List<String> binaryTreePaths(TreeNode root) {
        List<List<TreeNode>> result = helper(root);
        return convert(result);
    }

    private List<List<TreeNode>> helper(TreeNode root) {
        if (root == null) {
            return new LinkedList<>();
        }

        List<List<TreeNode>> result = helper(root.left);
        result.addAll(helper(root.right));

        if (result.isEmpty()) {
            List<TreeNode> newList = new LinkedList<>();
            newList.add(root);
            result.add(newList);
        } else {
            for (List<TreeNode> path : result) {
                path.add(0, root);
            }
        }

        return result;
    }

    private List<String> convert(List<List<TreeNode>> input) {
        return input.stream()
            .map(this::convertListToPath)
            .collect(Collectors.toList());
    }

    private String convertListToPath(List<TreeNode> paths) {
        StringBuilder builder = new StringBuilder();
        String delimiter = "";
        for (TreeNode node : paths) {
            builder.append(delimiter).append(node.val);
            delimiter = "->";
        }
        return builder.toString();
    }

    // private String convertListToPath2(List<TreeNode> paths) {
    // return paths.stream()
    // .map(node -> node.val.toString())
    // .collect(Collectors.joining("->"));
    // }
}
