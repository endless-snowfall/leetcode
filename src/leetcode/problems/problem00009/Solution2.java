package leetcode.problems.problem00009;

public class Solution2 {

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

        int leftMostDigitExtractionHelper = (int) Math.pow(10, numDigits - 1);

        int numDigitPairs = (numDigits % 2 == 0)
            ? (numDigits - 2) / 2
            : (numDigits - 1) / 2;

        for (int i = 0; i < numDigitPairs; i++) {
            int leftDigit = x / leftMostDigitExtractionHelper;
            int rightDigit = x % 10;

            if (leftDigit != rightDigit) {
                return false;
            }

            // remove left-most digit
            x = x % (leftDigit * leftMostDigitExtractionHelper);

            // remove right-most digit
            x /= 10;

            // since we removed two digits
            leftMostDigitExtractionHelper /= 100;

            if (x == 0) {
                return true;
            }
        }

        return true;
    }
}
