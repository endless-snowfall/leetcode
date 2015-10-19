package leetcode.problems.problem00172;

public class Solution {

    public int trailingZeroes(int n) {
        int result = 0;

        for (int i = 1; Math.pow(5, i) <= n; i++) {
            result += (n / Math.pow(5, i));
        }

        return result;
    }
}
