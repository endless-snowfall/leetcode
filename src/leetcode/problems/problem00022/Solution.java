package leetcode.problems.problem00022;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public List<String> generateParenthesis(int n) {
        if (n <= 0) {
            return new ArrayList<>();
        }

        return generateParenthesisRecursive(n);
    }

    private List<String> generateParenthesisRecursive(int n) {
        if (n == 1) {
            List<String> result = new ArrayList<String>();
            result.add("()");
            return result;
        }

        List<String> recursiveResults = generateParenthesisRecursive(n - 1);
        Set<String> resultSet = new HashSet<>();

        for (String recursiveResult : recursiveResults) {
            resultSet.addAll(makeAllPossibleResultsFrom(recursiveResult));
        }

        return new ArrayList<>(resultSet);
    }

    private Set<String> makeAllPossibleResultsFrom(String str) {
        Set<String> result = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            result.add(str.substring(0, i + 1) + "()" + str.substring(i + 1));
        }

        return result;
    }

}
