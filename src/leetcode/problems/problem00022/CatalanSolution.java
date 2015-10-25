package leetcode.problems.problem00022;

import java.util.ArrayList;
import java.util.List;

public class CatalanSolution {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if (n <= 0) {
            return result;
        }

        return helper(n);
    }

    private List<String> helper(int a) {
        List<String> result = new ArrayList<>();

        if (a == 0) {
            result.add("");
            return result;
        }

        for (int i = 0; i < a; i++) {
            List<String> first = helper(i);
            List<String> second = helper(a - 1 - i);

            for (String firstStr : first) {
                String prefix = "(" + firstStr + ")";
                for (String secondStr : second) {
                    result.add(prefix + secondStr);
                }
            }
        }

        return result;
    }
}
