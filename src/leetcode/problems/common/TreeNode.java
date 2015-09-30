package leetcode.problems.common;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.google.common.base.Joiner;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TreeNode {

    @NonNull public Integer val;
    public TreeNode left;
    public TreeNode right;

    @Override
    public String toString() {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(this);

        while (!queue.isEmpty()) {
            TreeNode current = queue.remove();
            result.add(current.val);
            queue.add(current.left);
            queue.add(current.right);
        }

        return Joiner.on(',').useForNull("null").join(result);
    }
}
