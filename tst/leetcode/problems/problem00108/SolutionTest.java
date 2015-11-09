package leetcode.problems.problem00108;

import static leetcode.problems.common.TestUtils.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;

public class SolutionTest extends TestBase {

    private Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertNull(solution.sortedArrayToBST(null));
    }

    @Test
    public void test2() {
        assertNull(solution.sortedArrayToBST(new int[] {}));
    }

    @Test
    public void test3() {
        assertTreesEquals(
            createTree(1),
            solution.sortedArrayToBST(new int[] { 1 }));
    }

    @Test
    public void test4() {
        assertTreesEquals(
            createTree(1, null, 2),
            solution.sortedArrayToBST(new int[] { 1, 2 }));
    }

    @Test
    public void test5() {
        assertTreesEquals(
            createTree(2, 1, 3),
            solution.sortedArrayToBST(new int[] { 1, 2, 3 }));
    }
}
