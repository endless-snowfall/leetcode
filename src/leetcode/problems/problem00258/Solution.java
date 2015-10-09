package leetcode.problems.problem00258;

public class Solution {

    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                num /= 10;
                sum += digit;
            }
            num = sum;
        }

        return num;
    }
}
