package leetcode.problems.problem00138;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public class ConciseSolution {

    private static final IntBinaryOperator XOR = (a, b) -> a ^ b;

    public int[] singleNumber(int[] nums) {
        int clump = Arrays.stream(nums).reduce(0, XOR);
        int mask = Integer.lowestOneBit(clump);
        int result1 = Arrays.stream(nums).filter(i -> (mask & i) == mask).reduce(0, XOR);
        return new int[] { result1, clump ^ result1 };
    }
}
