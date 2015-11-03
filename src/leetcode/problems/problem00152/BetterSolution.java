package leetcode.problems.problem00152;

public class BetterSolution {

    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        }

        int result = nums[0];
        int candidate = 1;
        int partial = 1;
        boolean beforeFirstNegative = true;

        for (int index = 0; index < nums.length; index++) {
            int currentNumber = nums[index];

            if (currentNumber != 0) {
                candidate *= currentNumber;

                if (beforeFirstNegative) {
                    partial *= currentNumber;
                }

                result = Math.max(result, candidate);
                result = Math.max(result, currentNumber);
            } else {
                result = Math.max(result, 0);

                candidate = 1;
                partial = 1;
                beforeFirstNegative = true;
            }

            if (candidate < 0 && candidate / partial != 1) {
                result = Math.max(result, candidate / partial);
            }

            if (currentNumber < 0) {
                beforeFirstNegative = false;
            }
        }

        return result;
    }
}
