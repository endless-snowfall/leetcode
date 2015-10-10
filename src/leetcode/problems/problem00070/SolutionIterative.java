package leetcode.problems.problem00070;

public class SolutionIterative {

    public int climbStairs(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }

        int fnMinus2 = 1;
        int fnMinus1 = 2;
        int fn = fnMinus1 + fnMinus2;

        for (int i = 3; i <= n; i++) {
            fn = fnMinus1 + fnMinus2;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
        }

        return fn;
    }
}
