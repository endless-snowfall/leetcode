package leetcode.problems.problem00050;

public class ConciseSolution {

    public double myPow(double x, int n) {
        return (n < 0)
            ? 1 / helper(x, -n)
            : helper(x, n);
    }

    private double helper(double x, int n) {
        if (n == 0) {
            return 1;
        }

        double temp = helper(x, n / 2);

        return (n % 2 == 0)
            ? temp * temp
            : temp * temp * x;
    }
}
