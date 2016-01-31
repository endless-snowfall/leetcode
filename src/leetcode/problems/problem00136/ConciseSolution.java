package leetcode.problems.problem00136;

import java.util.Arrays;

public class ConciseSolution {

    public int singleNumber(int[] nums) {
        return Arrays.stream(nums).reduce(0, (a, b) -> a ^ b);
    }
}
