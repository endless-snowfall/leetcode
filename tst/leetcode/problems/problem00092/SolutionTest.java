package leetcode.problems.problem00092;

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
        assertNull(solution.reverseBetween(null, 0, 0));
    }

    @Test
    public void test2() {
        assertNull(solution.reverseBetween(createList(1), 0, 0));
    }

    @Test
    public void test3() {
        assertListNodesEqual(createList(1), solution.reverseBetween(createList(1), 1, 1));
    }

    @Test
    public void test4() {
        assertListNodesEqual(createList(1, 2, 3), solution.reverseBetween(createList(1, 2, 3), 1, 1));
        assertListNodesEqual(createList(1, 2, 3), solution.reverseBetween(createList(1, 2, 3), 2, 2));
        assertListNodesEqual(createList(1, 2, 3), solution.reverseBetween(createList(1, 2, 3), 3, 3));
    }

    @Test
    public void test5() {
        assertListNodesEqual(createList(1, 4, 3, 2, 5), solution.reverseBetween(createList(1, 2, 3, 4, 5), 2, 4));
    }

    @Test
    public void test6() {
        assertListNodesEqual(createList(5, 3), solution.reverseBetween(createList(3, 5), 1, 2));
    }
}
