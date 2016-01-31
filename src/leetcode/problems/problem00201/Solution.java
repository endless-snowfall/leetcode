package leetcode.problems.problem00201;

public class Solution {

    public int rangeBitwiseAnd(int m, int n) {
        int diff = n - m;
        int mask = 1;
        int result = 0;

        while (mask > 0 && mask <= m) {
            if (diff <= mask && hits(mask, m) && hits(mask, n)) {
                result |= mask;
            }
            mask <<= 1;
        }

        return result;
    }

    private boolean hits(int mask, int n) {
        return (mask & n) == mask;
    }
}
