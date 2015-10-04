package leetcode.problems.problem00019;

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
        assertNull(solution.removeNthFromEnd(null, 1));
    }

    @Test
    public void test2() {
        assertNull(solution.removeNthFromEnd(createList(1), 1));
    }

    @Test
    public void test3() {
        assertListNodesEqual(createList(1), solution.removeNthFromEnd(createList(1, 2), 1));
    }

    @Test
    public void test4() {
        assertListNodesEqual(createList(2), solution.removeNthFromEnd(createList(1, 2), 2));
    }

    @Test
    public void test5() {
        assertListNodesEqual(createList(1, 2, 3, 5), solution.removeNthFromEnd(createList(1, 2, 3, 4, 5), 2));
    }
}
