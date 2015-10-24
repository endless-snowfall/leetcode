package leetcode.problems.problem00017;

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
            "ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"),
            solution.letterCombinations("23"));
    }

    @Test
    public void test2() {
        assertListsEqualUnordered(Lists.newArrayList(),
            solution.letterCombinations("1111100000"));
    }
}
