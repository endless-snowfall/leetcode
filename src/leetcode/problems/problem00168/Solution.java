package leetcode.problems.problem00168;

public class Solution {

    public String convertToTitle(int n) {
        StringBuilder builder = new StringBuilder();
        helper(builder, n);
        return builder.toString();
    }

    private void helper(StringBuilder builder, int n) {
        if (n > 26) {
            int magicNumber = (n % 26 == 0) ? (n / 26) - 1 : n / 26;
            helper(builder, magicNumber);
            n %= 26;
        }

        if (n % 26 == 0) {
            builder.append('Z');
        } else {
            builder.append((char) ((n % 26) + 64));
        }
    }
}
