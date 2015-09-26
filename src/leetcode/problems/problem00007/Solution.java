package leetcode.problems.problem00007;

public class Solution {

    public int reverse(int x) {
        if (x < 10 && x > -10) {
            return x;
        }

        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x *= -1;
        }

        int result = 0;

        while (x > 0) {
            int digit = x % 10;
            x /= 10;

            if (Integer.MAX_VALUE / 10 < result) {
                return 0;
            }

            result *= 10;
            result += digit;
        }

        return (isNegative)
            ? result *= -1
            : result;
    }
}
