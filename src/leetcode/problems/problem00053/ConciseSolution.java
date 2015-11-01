package leetcode.problems.problem00053;

public class ConciseSolution {

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int result = Integer.MIN_VALUE;
        int candidate = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            candidate = (candidate > 0)
                ? candidate + nums[i]
                : nums[i];

            result = Math.max(candidate, result);
        }

        return result;
    }
}
