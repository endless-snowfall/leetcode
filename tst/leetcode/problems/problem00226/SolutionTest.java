package leetcode.problems.problem00226;

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
        assertNull(solution.invertTree(null));
    }

    @Test
    public void test2() {
        assertTreesEquals(createTree(1), solution.invertTree(createTree(1)));
    }

    @Test
    public void test3() {
        assertTreesEquals(createTree(1, 2, null), solution.invertTree(createTree(1, null, 2)));
    }

    @Test
    public void test4() {
        assertTreesEquals(createTree(1, null, 2), solution.invertTree(createTree(1, 2, null)));
    }

    @Test
    public void test5() {
        assertTreesEquals(createTree(1, 3, 2), solution.invertTree(createTree(1, 2, 3)));
    }

    @Test
    public void test6() {
        assertTreesEquals(createTree(4, 7, 2, 9, 6, 3, 1), solution.invertTree(createTree(4, 2, 7, 1, 3, 6, 9)));
    }
}
