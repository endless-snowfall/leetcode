package leetcode.problems.problem00022;

import static leetcode.problems.common.TestUtils.*;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;

import leetcode.problems.common.TestBase;

public class SolutionTest extends TestBase {

    private ConciseSolution solution;

    @Before
    public void before() {
        solution = new ConciseSolution();
    }

    @Test
    public void test1() {
        assertListsEqualUnordered(Lists.newArrayList(
            "()"),
            solution.generateParenthesis(1));
    }

    @Test
    public void test2() {
        assertListsEqualUnordered(Lists.newArrayList(
            "()()", "(())"),
            solution.generateParenthesis(2));
    }

    @Test
    public void test3() {
        assertListsEqualUnordered(Lists.newArrayList(
            "((()))", "(()())", "(())()", "()(())", "()()()"),
            solution.generateParenthesis(3));
    }

    @Test
    public void test4() {
        assertListsEqualUnordered(Lists.newArrayList(
            "()()()()", "()()(())", "()(())()", "()(()())", "()((()))", "(())()()",
            "(())(())", "(()())()", "(()()())", "(()(()))", "((()))()", "((())())",
            "((()()))", "(((())))"),
            solution.generateParenthesis(4));
    }
}
