package leetcode.problems.problem00017;

import java.util.ArrayList;
import java.util.List;

public class ConciseSolution {

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        helper(result, builder, digits, 0);
        return result;
    }

    private void helper(List<String> result, StringBuilder builder, String digits, int index) {
        if (index == digits.length()) {
            if (builder.length() > 0) {
                result.add(builder.toString());
            }
            return;
        }

        char digit = digits.charAt(index);

        if (digit == '0' || digit == '1') {
            helper(result, builder, digits, index + 1);
            return;
        }

        String letters = getLetters(digit);

        for (int i = 0; i < letters.length(); i++) {
            builder.append(letters.charAt(i));
            helper(result, builder, digits, index + 1);
            builder.deleteCharAt(builder.length() - 1);
        }
    }

    private String getLetters(Character digit) {
        if (digit == '2') {
            return "abc";
        } else if (digit == '3') {
            return "def";
        } else if (digit == '4') {
            return "ghi";
        } else if (digit == '5') {
            return "jkl";
        } else if (digit == '6') {
            return "mno";
        } else if (digit == '7') {
            return "pqrs";
        } else if (digit == '8') {
            return "tuv";
        } else if (digit == '9') {
            return "wxyz";
        } else {
            return "";
        }
    }
}
