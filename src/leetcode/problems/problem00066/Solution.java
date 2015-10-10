package leetcode.problems.problem00066;

public class Solution {

    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return new int[] { 1 };
        }

        // Only way to have a result with more digits than the input
        if (isAllNines(digits)) {
            return makePowerOfTen(digits.length);
        }

        // We know the result will have the same number of digits as the input
        int[] result = new int[digits.length];
        int carry = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            int newDigit = digits[i] + carry;
            carry = 0;

            if (newDigit >= 10) {
                carry = 1;
                newDigit %= 10;
            }

            result[i] = newDigit;
        }

        return result;
    }

    private boolean isAllNines(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 9) {
                return false;
            }
        }
        return true;
    }

    private int[] makePowerOfTen(int numZeroes) {
        int[] result = new int[numZeroes + 1];
        result[0] = 1;
        for (int i = 1; i < result.length; i++) {
            result[i] = 0;
        }
        return result;
    }
}
