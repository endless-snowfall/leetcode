package leetcode.problems.problem00297;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import leetcode.problems.common.TreeNode;

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));

public class Codec {

    private static final String NULL_NODE = "#";
    private static final String DELIMITER = ",";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder builder = new StringBuilder();
        serializeHelper(root, builder);
        return builder.toString();
    }

    private void serializeHelper(TreeNode node, StringBuilder builder) {
        if (builder.length() != 0) {
            builder.append(DELIMITER);
        }

        if (node == null) {
            builder.append(NULL_NODE);
            return;
        }

        builder.append(node.val);
        serializeHelper(node.left, builder);
        serializeHelper(node.right, builder);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return deserializeHelper(Arrays.stream(data.split(DELIMITER)).collect(Collectors.toList()));
    }

    private TreeNode deserializeHelper(List<String> input) {
        String value = input.remove(0);

        if (value.equals(NULL_NODE)) {
            return null;
        }

        TreeNode node = new TreeNode(Integer.valueOf(value));
        node.left = deserializeHelper(input);
        node.right = deserializeHelper(input);
        return node;
    }
}
