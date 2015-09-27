package leetcode.problems.problem00011;

public class Solution2 {

    public int maxArea(int[] height) {
        if (height == null || height.length < 1) {
            return 0;
        }

        int result = 0;

        for (int i = 0; i < height.length; i++) {
            int currentHeight = height[i];
            int leftMostIndex = findLeftMostIndex(height, currentHeight, i);
            int rightMostIndex = findRightMostIndex(height, currentHeight, i);
            int candidate = (rightMostIndex - leftMostIndex) * currentHeight;
            result = (candidate > result) ? candidate : result;
        }

        return result;
    }

    private int findLeftMostIndex(int[] height, int currentHeight, int start) {
        int result = start;

        while (result - 1 >= 0 && height[result - 1] >= currentHeight) {
            result--;
        }

        return result;
    }

    private int findRightMostIndex(int[] height, int currentHeight, int start) {
        int result = start;

        while (result + 1 < height.length && height[result + 1] >= currentHeight) {
            result++;
        }

        return result;
    }
}
