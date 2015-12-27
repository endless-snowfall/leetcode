package leetcode.problems.problem00113;

import static leetcode.problems.common.TestUtils.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;

import leetcode.problems.common.TestBase;
import leetcode.problems.common.TreeNode;

public class SolutionTest extends TestBase {

    private Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertTrue(solution.pathSum(null, 1).isEmpty());
    }

    @Test
    public void test2() {
        List<List<Integer>> expected = Lists.newArrayList();
        expected.add(Lists.newArrayList(1));
        assertEquals(expected, solution.pathSum(createTree(1), 1));
    }

    @Test
    public void test3() {
        assertTrue(solution.pathSum(createTree(1), 0).isEmpty());
    }

    @Test
    public void test4() {
        TreeNode input = createTree(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, null, null, 1);
        List<List<Integer>> expected = Lists.newArrayList();

        expected.add(Lists.newArrayList(5, 4, 11, 7));
        assertEquals(expected, solution.pathSum(input, 27));
        expected.clear();

        expected.add(Lists.newArrayList(5, 4, 11, 2));
        assertEquals(expected, solution.pathSum(input, 22));
        expected.clear();

        expected.add(Lists.newArrayList(5, 8, 13));
        assertEquals(expected, solution.pathSum(input, 26));
        expected.clear();

        expected.add(Lists.newArrayList(5, 8, 4, 1));
        assertEquals(expected, solution.pathSum(input, 18));
        expected.clear();

        assertTrue(solution.pathSum(input, 20).isEmpty());
        assertTrue(solution.pathSum(input, 9).isEmpty());
        assertTrue(solution.pathSum(input, 5).isEmpty());

        assertTrue(solution.pathSum(input, 13).isEmpty());

        assertTrue(solution.pathSum(input, 17).isEmpty());
    }
}
