package leetcode.problems.problem00257;

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
        assertTrue(solution.binaryTreePaths(null).isEmpty());
    }

    @Test
    public void test2() {
        TreeNode tree = createTree(1);
        List<String> result = solution.binaryTreePaths(tree);

        assertEquals(1, result.size());
        assertEquals(Lists.newArrayList("1"), result);
    }

    @Test
    public void test3() {
        TreeNode tree = createTree(1, 2, 3, null, 5, null, null);
        List<String> result = solution.binaryTreePaths(tree);

        assertEquals(2, result.size());
        assertEquals(Lists.newArrayList("1->2->5", "1->3"), result);
    }
}
