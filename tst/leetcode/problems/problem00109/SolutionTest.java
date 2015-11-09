package leetcode.problems.problem00109;

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
        assertNull(solution.sortedListToBST(null));
    }

    @Test
    public void test2() {
        assertTreesEquals(
            createTree(1),
            solution.sortedListToBST(createList(1)));
    }

    @Test
    public void test3() {
        assertTreesEquals(
            createTree(1, null, 2, null, null),
            solution.sortedListToBST(createList(1, 2)));
    }

    @Test
    public void test4() {
        assertTreesEquals(
            createTree(2, 1, 3),
            solution.sortedListToBST(createList(1, 2, 3)));
    }

    @Test
    public void test5() {
        System.out.println(solution.sortedListToBST(createList(-1, 0, 1, 2)));
        assertTreesEquals(
            createTree(0, -1, 1, null, null, null, 2),
            solution.sortedListToBST(createList(-1, 0, 1, 2)));
    }
}
