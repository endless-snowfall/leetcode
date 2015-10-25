package leetcode.problems.problem00022;

import java.util.ArrayList;
import java.util.List;

public class BetterSolution {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if (n <= 0) {
            return result;
        }

        StringBuilder builder = new StringBuilder();
        helper(result, builder, n, n);
        return result;
    }

    private void helper(List<String> result, StringBuilder builder, int numOpen, int numClose) {
        if (numOpen == 0) {
            add(builder, ')', numClose);
            result.add(builder.toString());
            remove(builder, numClose);
            return;
        }

        for (int i = numOpen; i >= 0 && numOpen - i <= numClose - 1; i--) {
            add(builder, '(', i);
            add(builder, ')', 1);
            helper(result, builder, numOpen - i, numClose - 1);
            remove(builder, 1);
            remove(builder, i);
        }
    }

    private void add(StringBuilder builder, char c, int numChars) {
        for (int i = 0; i < numChars; i++) {
            builder.append(c);
        }
    }

    private void remove(StringBuilder builder, int numChars) {
        if (numChars == 0) {
            return;
        }
        builder.delete(builder.length() - numChars, builder.length());
    }
}
