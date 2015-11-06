package leetcode.problems.problem00268;

public class ConciseSolution {

    public int missingNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int sum = (nums.length * (nums.length + 1)) / 2;

        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
        }

        return sum;
    }
}
