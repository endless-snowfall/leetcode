package leetcode.problems.problem00011;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int maxArea(int[] height) {
        if (height.length < 1) {
            return 0;
        }

        int result = 0;
        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();

        for (int i = 0; i < height.length; i++) {
            int currentHeight = height[i];
            if (!left.containsKey(currentHeight)) {
                left.put(currentHeight, i);
            } else {
                right.put(currentHeight, i);
            }
        }

        for (int currentHeight : left.keySet()) {
            if (!right.containsKey(currentHeight)) {
                continue;
            }
            int leftMost = left.get(currentHeight);
            int rightMost = right.get(currentHeight);
            int candidate = (rightMost - leftMost) * currentHeight;
            result = (candidate > result) ? candidate : result;
        }

        return result;
    }
}
