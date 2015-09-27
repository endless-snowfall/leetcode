package leetcode.problems.problem00009;

public class Solution1 {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x < 10) {
            return true;
        }

        int input = x;
        int numDigits = 0;

        while (input > 0) {
            numDigits++;
            input /= 10;
        }

        boolean hasEvenNumberOfDigits = numDigits % 2 == 0;
        int numDigitPairs = hasEvenNumberOfDigits
            ? numDigits / 2
            : (numDigits - 1) / 2;

        int reverse = 0;

        for (int i = 0; i < numDigitPairs; i++) {
            int rightDigit = x % 10;
            reverse *= 10;
            reverse += rightDigit;

            // remove right-most digit from original
            x /= 10;
        }

        if (!hasEvenNumberOfDigits) {
            x /= 10;
        }

        return x == reverse;
    }
}
