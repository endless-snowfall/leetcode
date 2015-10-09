package leetcode.problems.problem00202;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean isHappy(int n) {
        if (n <= 0) {
            return false;
        }

        Set<Integer> seen = new HashSet<>();

        while (n != 1) {
            if (seen.contains(n)) {
                return false;
            }
            seen.add(n);
            n = getSumOfDigits(n);
        }

        return true;
    }

    private int getSumOfDigits(int n) {
        int result = 0;

        while (n > 0) {
            int digit = n % 10;
            result += digit * digit;
            n /= 10;
        }

        return result;
    }
}
