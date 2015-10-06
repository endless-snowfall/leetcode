package leetcode.problems.problem00029;

public class Solution {

    public int divide(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        }

        if (divisor == 1) {
            return dividend;
        }

        if (divisor == -1) {
            return (dividend == Integer.MIN_VALUE)
                ? Integer.MAX_VALUE
                : dividend * -1;
        }

        boolean dividendIsNegative = (dividend < 0);
        boolean divisorIsNegative = (divisor < 0);

        boolean makeResultNegative;

        if (dividendIsNegative && divisorIsNegative) {
            makeResultNegative = false;
        } else if (!dividendIsNegative && !divisorIsNegative) {
            makeResultNegative = false;
        } else if (dividendIsNegative && !divisorIsNegative) {
            divisor *= -1;
            makeResultNegative = true;
        } else { // !dividendIsNegative && divisorIsNegative
            divisor *= -1;
            makeResultNegative = true;
        }

        int sum = 0;
        int result = 0;

        while (sum != dividend) {
            if (dividendIsNegative && dividend - divisor > sum) {
                break;
            }
            if (!dividendIsNegative && dividend - sum < divisor) {
                break;
            }

            sum += divisor;
            result++;
        }

        return (makeResultNegative) ? result * -1 : result;
    }
}
