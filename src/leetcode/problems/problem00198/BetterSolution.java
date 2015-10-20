package leetcode.problems.problem00198;

public class BetterSolution {

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int fnMinusThree = nums[0];
        int fnMinusTwo = nums[1];
        int fnMinusOne = nums[2] + fnMinusThree;

        for (int i = 3; i < nums.length; i++) {
            int temp = Math.max(fnMinusTwo, fnMinusThree) + nums[i];
            fnMinusThree = fnMinusTwo;
            fnMinusTwo = fnMinusOne;
            fnMinusOne = temp;
        }

        return Math.max(fnMinusOne, fnMinusTwo);
    }
}
