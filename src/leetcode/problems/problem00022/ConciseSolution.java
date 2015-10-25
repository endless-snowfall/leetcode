package leetcode.problems.problem00022;

import java.util.ArrayList;
import java.util.List;

public class ConciseSolution {

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
        if (numClose == 0) {
            result.add(builder.toString());
            return;
        }

        if (numOpen > 0) {
            builder.append('(');
            helper(result, builder, numOpen - 1, numClose);
            builder.deleteCharAt(builder.length() - 1);
        }

        if (numClose > numOpen) {
            builder.append(')');
            helper(result, builder, numOpen, numClose - 1);
            builder.deleteCharAt(builder.length() - 1);
        }
    }
}
