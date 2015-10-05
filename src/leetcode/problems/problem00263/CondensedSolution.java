package leetcode.problems.problem00263;

import java.util.Arrays;

public class CondensedSolution {

    public boolean isUgly(int num) {
        if (num < 1) {
            return false;
        }

        for (int base : Arrays.asList(2, 3, 5)) {
            if (num % base == 0) {
                num /= base;
            }
        }

        return num == 1;
    }
}