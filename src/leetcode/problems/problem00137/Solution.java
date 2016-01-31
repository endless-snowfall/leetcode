package leetcode.problems.problem00137;

import java.util.Arrays;

public class Solution {

    public static enum Digit {
        ZERO, ONE, TWO;
    }

    public int singleNumber(int[] nums) {
        Digit[] digits = new Digit[32];
        Arrays.fill(digits, Digit.ZERO);
        Arrays.stream(nums).forEach(i -> add(digits, i));
        return getResult(digits);
    }

    private void add(Digit[] digits, int n) {
        int mask = 1;
        for (int i = 31; i >= 0; i--) {
            if ((mask & n) == mask) {
                digits[i] = (digits[i] == Digit.ONE) ? Digit.TWO : (digits[i] == Digit.ZERO) ? Digit.ONE : Digit.ZERO;
            }
            mask <<= 1;
        }
    }

    private int getResult(Digit[] digits) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result *= 2;
            result += (digits[i] == Digit.ONE) ? 1 : 0;
        }
        return result;
    }
}
