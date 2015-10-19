package leetcode.problems.problem00171;

public class Solution {

    public int titleToNumber(String s) {
        if (s == null) {
            return 0;
        }

        int result = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int value = (s.charAt(i) - 65) + 1;
            result += value * Math.pow(26, s.length() - 1 - i);
        }

        return result;
    }
}
