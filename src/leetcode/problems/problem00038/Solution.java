package leetcode.problems.problem00038;

public class Solution {

    public String countAndSay(int n) {
        if (n <= 0) {
            return "";
        }

        String number = String.valueOf(1);
        StringBuilder numberBuilder = new StringBuilder();

        for (int i = 1; i < n; i++) {
            int digitCount = 1;
            char digit = number.charAt(0);
            int readIndex = 1;

            while (readIndex < number.length()) {
                char character = number.charAt(readIndex);

                if (character == digit) {
                    digitCount++;
                } else {
                    appendToNumber(numberBuilder, digit, digitCount);
                    digit = character;
                    digitCount = 1;
                }
                readIndex++;
            }

            appendToNumber(numberBuilder, digit, digitCount);
            number = numberBuilder.toString();
            numberBuilder.setLength(0);
        }

        return number;
    }

    private void appendToNumber(StringBuilder builder, char digit, int digitCount) {
        builder.append(digitCount).append(digit);
    }
}
