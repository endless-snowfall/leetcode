package leetcode.problems.problem00042;

public class Solution {

    public int trap(int[] height) {
        int result = 0;
        int startIndex = 0;

        if (height == null || height.length == 0) {
            return result;
        }

        while (startIndex < height.length) {
            int startHeight = height[startIndex];
            int endIndex = seek(startIndex + 1, startHeight, height);

            if (endIndex == -1 || endIndex == startIndex + 1) {
                startIndex++;
                continue;
            }

            result += count(startIndex + 1, endIndex - 1, Math.min(startHeight, height[endIndex]), height);
            startIndex = endIndex;
        }

        return result;
    }

    private int seek(int startInclusive, int startHeight, int[] height) {
        int resultHeight = -1;
        int result = -1;

        for (int i = startInclusive; i < height.length; i++) {
            if (height[i] >= startHeight) {
                return i;
            }
            if (height[i] >= resultHeight) {
                resultHeight = height[i];
                result = i;
            }
        }

        return result;
    }

    private int count(int startInclusive, int endInclusive, int startHeight, int[] height) {
        int result = 0;
        for (int i = startInclusive; i <= endInclusive; i++) {
            result += startHeight - height[i];
        }
        return result;
    }
}
