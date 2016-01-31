package leetcode.problems.problem00138;

import java.util.Arrays;

public class BetterSolution {

    public int[] singleNumber(int[] nums) {
        int clump = Arrays.stream(nums).reduce(0, (a, b) -> a ^ b);
        int mask = findMask(clump, 1);
        return new int[] {
            Arrays.stream(nums).filter(i -> hitsMask(mask, i)).reduce(0, (a, b) -> a ^ b),
            Arrays.stream(nums).filter(i -> !hitsMask(mask, i)).reduce(0, (a, b) -> a ^ b)
        };
    }

    private int findMask(int clump, int mask) {
        return ((clump & mask) == mask) ? mask : findMask(clump, mask << 1);
    }

    private boolean hitsMask(int mask, int number) {
        return (mask & number) == mask;
    }
}
