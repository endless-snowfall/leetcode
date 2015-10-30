package leetcode.problems.problem00050;

public class Solution {

    public double myPow(double x, int n) {
        boolean xIsNegative = false;
        boolean nIsNegative = false;

        if (x < 0) {
            xIsNegative = true;
            x *= -1;
        }

        if (n < 0) {
            nIsNegative = true;
            n *= -1;
        }

        double result = helper(x, n);
        result = (xIsNegative && n % 2 == 1) ? -1 * result : result;
        return (nIsNegative) ? 1 / result : result;
    }

    private double helper(double x, int n) {
        if (x == 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else if (n == 1) {
            return x;
        }

        int exponent = n / 2;
        int remainder = n % 2;
        double temp = helper(x, exponent);

        return (temp * temp) * ((remainder == 1) ? x : 1);
    }
}
