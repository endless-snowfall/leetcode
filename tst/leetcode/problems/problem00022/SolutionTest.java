package leetcode.problems.problem00022;

import static leetcode.problems.common.TestUtils.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;

import leetcode.problems.common.TestBase;

public class SolutionTest extends TestBase {

    private CatalanSolution solution;

    @Before
    public void before() {
        solution = new CatalanSolution();
    }

    @Test
    public void test1() {
        assertTrue(solution.generateParenthesis(0).isEmpty());
    }

    @Test
    public void test2() {
        assertListsEqualUnordered(Lists.newArrayList(
            "()"),
            solution.generateParenthesis(1));
    }

    @Test
    public void test3() {
        assertListsEqualUnordered(Lists.newArrayList(
            "()()", "(())"),
            solution.generateParenthesis(2));
    }

    @Test
    public void test4() {
        assertListsEqualUnordered(Lists.newArrayList(
            "((()))", "(()())", "(())()", "()(())", "()()()"),
            solution.generateParenthesis(3));
    }

    @Test
    public void test5() {
        assertListsEqualUnordered(Lists.newArrayList(
            "()()()()", "()()(())", "()(())()", "()(()())", "()((()))", "(())()()",
            "(())(())", "(()())()", "(()()())", "(()(()))", "((()))()", "((())())",
            "((()()))", "(((())))"),
            solution.generateParenthesis(4));
    }
}
