package leetcode.problems.problem00096;

public class Solution {

    public int numTrees(int n) {
        if (n <= 0) {
            return 0;
        }

        return helper(n);
    }

    private int helper(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        }

        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += helper(i - 1) * helper(n - i);
        }
        return result;
    }
}
