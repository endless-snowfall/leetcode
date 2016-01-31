package leetcode.problems.problem00042;

public class ConciseSolution {

    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int[] maxHeightTail = getMaxHeightTail(height);
        int water = 0;
        int index = 0;

        while (index < height.length - 1) {
            int targetHeight = Math.min(height[index], maxHeightTail[index + 1]);
            index++;

            while (height[index] < targetHeight) {
                water += targetHeight - height[index];
                index++;
            }
        }

        return water;
    }

    private int[] getMaxHeightTail(int[] height) {
        int[] result = new int[height.length];
        int max = 0;

        for (int i = height.length - 1; i >= 0; i--) {
            max = Math.max(max, height[i]);
            result[i] = max;
        }

        return result;
    }
}
