package leetcode.problems.problem00206;

import static leetcode.problems.common.TestUtils.*;

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
        assertListNodesEqual(null, solution.reverseList(null));
    }

    @Test
    public void test2() {
        assertListNodesEqual(createList(1), solution.reverseList(createList(1)));
    }

    @Test
    public void test3() {
        assertListNodesEqual(createList(1, 2), solution.reverseList(createList(2, 1)));
    }

    @Test
    public void test4() {
        assertListNodesEqual(createList(1, 2, 1), solution.reverseList(createList(1, 2, 1)));
    }

    @Test
    public void test5() {
        assertListNodesEqual(createList(1, 2, 3, 4, 5, 6), solution.reverseList(createList(6, 5, 4, 3, 2, 1)));
    }
}
