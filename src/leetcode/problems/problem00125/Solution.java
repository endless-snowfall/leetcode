package leetcode.problems.problem00125;

import java.util.Stack;

public class Solution {

    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        int n = getAlphanumericCount(s);

        if (n == 0) {
            return true;
        }

        boolean skipExtraLetter = (n % 2 == 1);
        Stack<Character> stack = new Stack<>();
        int numAlphanumericProcessed = 0;
        int index = 0;

        while (numAlphanumericProcessed < n / 2) {
            char c = s.charAt(index);
            index++;
            if (!isAlphanumeric(c)) {
                continue;
            }
            numAlphanumericProcessed++;
            stack.push(c);
        }

        while (!stack.isEmpty()) {
            char c = s.charAt(index);
            index++;
            if (!isAlphanumeric(c)) {
                continue;
            } else if (skipExtraLetter) {
                skipExtraLetter = false;
                continue;
            }
            if (Character.toUpperCase(c) != Character.toUpperCase(stack.peek())) {
                return false;
            }
            stack.pop();
        }

        return true;
    }

    private int getAlphanumericCount(String s) {
        int result = 0;
        for (char c : s.toCharArray()) {
            if (isAlphanumeric(c)) {
                result++;
            }
        }
        return result;
    }

    private boolean isAlphanumeric(char c) {
        return Character.isLetter(c) || Character.isDigit(c);
    }
}
