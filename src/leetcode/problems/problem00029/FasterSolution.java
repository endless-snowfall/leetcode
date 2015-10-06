package leetcode.problems.problem00029;

public class FasterSolution {

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
        int factor = 1;

        if (dividendIsNegative) {
            while (sum != dividend) {
                // Used to be (dividend - factor * divisor > sum)
                if (((dividend - sum) / factor) - divisor > 0) {
                    if (factor == 1) {
                        break;
                    }
                    factor /= 2;
                } else {
                    sum += factor * divisor;
                    result += factor;
                    factor *= 2;
                }
            }
        }

        if (!dividendIsNegative) {
            while (sum != dividend) {
                // Used to be (dividend - sum < factor * divisor)
                if ((dividend - sum) / divisor < factor) {
                    if (factor == 1) {
                        break;
                    }
                    factor /= 2;
                } else {
                    sum += factor * divisor;
                    result += factor;
                    factor *= 2;
                }
            }
        }

        return (makeResultNegative) ? result * -1 : result;
    }
}
