package leetcode.problems.problem00263;

public class Solution {

    public boolean isUgly(int num) {
        if (num < 1) {
            return false;
        } else if (num == 1) {
            return true;
        }

        int n1 = helper(2, num);
        int n2 = helper(3, n1);
        return helper(5, n2) == 1;
    }

    private int helper(int base, int target) {
        if (target == 1) {
            return target;
        }

        double result = target;

        while (result > 1 && Math.floor(result * 1d / base) == result * 1d / base) {
            result /= base;
        }

        return (int) result;
    }
}