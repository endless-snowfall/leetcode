package leetcode.problems.problem00062;

import java.math.BigInteger;

public class BigIntegerSolution {

    public int uniquePaths(int m, int n) {
        if (m <= 0 || n <= 0) {
            return 0;
        }

        return helper(m, n).intValue();
    }

    private BigInteger helper(int m, int n) {
        BigInteger mPlusNFactorial = factorial((m - 1) + (n - 1));
        BigInteger mFactorial = factorial(m - 1);
        BigInteger nFactorial = factorial(n - 1);
        return mPlusNFactorial.divide(mFactorial.multiply(nFactorial));
    }

    private BigInteger factorial(int x) {
        BigInteger factorial = BigInteger.valueOf(1);
        for (int i = 1; i <= x; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
