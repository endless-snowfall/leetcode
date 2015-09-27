package leetcode.problems.problem00011;

public class Solution3 {

    public int maxArea(int[] height) {
        if (height == null || height.length < 1) {
            return 0;
        }

        int result = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            result = Math.max(result, minHeight * (right - left));

            if (height[left] == minHeight) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}
