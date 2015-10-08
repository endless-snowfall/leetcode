package leetcode.problems.problem00107;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;

import leetcode.problems.common.TestBase;
import leetcode.problems.common.TestUtils;

public class SolutionTest extends TestBase {

    private Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertTrue(solution.levelOrderBottom(null).isEmpty());
    }

    @Test
    public void test2() {
        List<List<Integer>> expectedResult = new ArrayList<>();
        expectedResult.add(Arrays.asList(1));

        assertEquals(expectedResult, solution.levelOrderBottom(TestUtils.createTree(1)));
    }

    @SuppressWarnings("unchecked")
    @Test
    public void test3() {
        assertEquals(Lists.newArrayList(
            Lists.newArrayList(15, 7),
            Lists.newArrayList(9, 20),
            Lists.newArrayList(3)),
            solution.levelOrderBottom(TestUtils.createTree(3, 9, 20, null, null, 15, 7)));
    }
}
