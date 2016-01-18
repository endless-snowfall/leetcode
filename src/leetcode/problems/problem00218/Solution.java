package leetcode.problems.problem00218;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<int[]> getSkyline(int[][] buildings) {
        List<int[]> result = new ArrayList<>();

        if (buildings == null || buildings.length == 0) {
            return result;
        }

        int[] heights = new int[26];
        for (int i = 0; i < buildings.length; i++) {
            draw(heights, buildings[i]);
        }

        buildResult(result, heights);
        return result;
    }

    private void draw(int[] heights, int[] building) {
        for (int x = building[0]; x < building[1]; x++) {
            heights[x] = (heights[x] >= building[2]) ? heights[x] : building[2];
        }
    }

    private void buildResult(List<int[]> result, int[] heights) {
        int prevY = 0;
        for (int x = 0; x < heights.length; x++) {
            int newY = heights[x];
            if (newY != prevY) {
                result.add(new int[] { x, newY });
                prevY = newY;
            }
        }
    }
}
