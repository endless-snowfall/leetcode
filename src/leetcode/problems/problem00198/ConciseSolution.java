package leetcode.problems.problem00198;

public class ConciseSolution {

    public int rob(int[] nums) {
        if (nums == null) {
            return 0;
        }

        int fnMinusOne = 0, fnMinusTwo = 0, fnMinusThree = 0;

        for (int i = 0; i < nums.length; i++) {
            int temp = Math.max(fnMinusTwo, fnMinusThree) + nums[i];
            fnMinusThree = fnMinusTwo;
            fnMinusTwo = fnMinusOne;
            fnMinusOne = temp;
        }

        return Math.max(fnMinusOne, fnMinusTwo);
    }
}
