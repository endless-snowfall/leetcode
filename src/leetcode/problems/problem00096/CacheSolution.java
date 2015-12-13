package leetcode.problems.problem00096;

public class CacheSolution {

    public int numTrees(int n) {
        if (n <= 0) {
            return 0;
        }

        return helper(n, new int[n + 1]);
    }

    private int helper(int n, int[] cache) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else if (cache[n] != 0) {
            return cache[n];
        }

        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += helper(i - 1, cache) * helper(n - i, cache);
        }
        cache[n] = result;
        return result;
    }
}
