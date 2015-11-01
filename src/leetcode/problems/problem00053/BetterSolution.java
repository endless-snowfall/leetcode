package leetcode.problems.problem00053;

public class BetterSolution {

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int result = Integer.MIN_VALUE;
        int candidate = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];

            if (candidate > 0) {
                candidate += current;
            } else {
                candidate = current;
            }

            result = Math.max(candidate, result);
        }

        return result;
    }
}
