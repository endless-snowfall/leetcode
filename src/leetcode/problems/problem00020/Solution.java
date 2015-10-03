package leetcode.problems.problem00020;

import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (isOpenBracket(c)) {
                stack.push(c);
            } else if (isCloseBracket(c)) {
                if (stack.isEmpty()) {
                    return false;
                } else if (matchesOpenBracket(stack.peek(), c)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private boolean matchesOpenBracket(char open, char close) {
        if (open == '(') {
            return close == ')';
        } else if (open == '[') {
            return close == ']';
        } else {
            return close == '}';
        }
    }

    private boolean isOpenBracket(Character c) {
        return c == '(' || c == '[' || c == '{';
    }

    private boolean isCloseBracket(Character c) {
        return c == ')' || c == ']' || c == '}';
    }
}
