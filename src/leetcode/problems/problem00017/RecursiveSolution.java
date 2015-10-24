package leetcode.problems.problem00017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RecursiveSolution {

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        return helper(digits, 0, false);
    }

    private List<String> helper(String digits, int index, boolean sawNonZeroOrOne) {
        List<String> result = new ArrayList<>();

        if (index == digits.length()) {
            if (sawNonZeroOrOne) {
                result.add("");
            }
            return result;
        }

        Character digit = digits.charAt(index);
        if (digit == '0' || digit == '1') {
            return helper(digits, index + 1, sawNonZeroOrOne);
        }
        sawNonZeroOrOne = true;

        for (String partialResult : helper(digits, index + 1, sawNonZeroOrOne)) {
            for (Character letter : getLetters(digit)) {
                result.add(letter + partialResult);
            }
        }

        return result;
    }

    private List<Character> getLetters(Character digit) {
        if (digit == '2') {
            return Arrays.asList('a', 'b', 'c');
        } else if (digit == '3') {
            return Arrays.asList('d', 'e', 'f');
        } else if (digit == '4') {
            return Arrays.asList('g', 'h', 'i');
        } else if (digit == '5') {
            return Arrays.asList('j', 'k', 'l');
        } else if (digit == '6') {
            return Arrays.asList('m', 'n', 'o');
        } else if (digit == '7') {
            return Arrays.asList('p', 'q', 'r', 's');
        } else if (digit == '8') {
            return Arrays.asList('t', 'u', 'v');
        } else if (digit == '9') {
            return Arrays.asList('w', 'x', 'y', 'z');
        } else {
            return Collections.emptyList();
        }
    }
}
