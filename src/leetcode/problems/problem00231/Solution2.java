package leetcode.problems.problem00231;

public class Solution2 {

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        return countOnes(n) == 1;
    }

    private int countOnes(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int bitmask = 1 << i;
            if ((bitmask & n) == bitmask) {
                result++;
            }
        }
        return result;
    }
}
