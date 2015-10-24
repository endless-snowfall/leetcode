package leetcode.problems.problem00017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IterativeSolution {

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return result;
        }

        for (int i = 0; i < digits.length(); i++) {
            char digit = digits.charAt(i);

            if (digit == '0' || digit == '1') {
                continue;
            } else if (result.isEmpty()) {
                result.add("");
            }

            List<String> newResult = new ArrayList<>();

            for (Character letter : getLetters(digit)) {
                for (String partialResult : result) {
                    newResult.add(partialResult + letter);
                }
            }

            result = newResult;
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
