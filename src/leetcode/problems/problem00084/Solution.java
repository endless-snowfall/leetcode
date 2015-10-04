package leetcode.problems.problem00084;

public class Solution {

    public int largestRectangleArea(int[] height) {
        if (height == null) {
            return 0;
        } else if (height.length == 1) {
            return height[0];
        }

        int result = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int maxHeight = Math.max(height[left], height[right]);
            int candidate = Math.max(maxHeight, minHeight * (right - left + 1));
            result = Math.max(result, candidate);

            if (height[left] == minHeight) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}
