package leetcode.problems.problem00203;

import static leetcode.problems.common.TestUtils.assertListNodesEqual;
import static leetcode.problems.common.TestUtils.createList;

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
        assertListNodesEqual(null, solution.removeElements(null, 1));
    }

    @Test
    public void test2() {
        assertListNodesEqual(null, solution.removeElements(createList(1), 1));
    }

    @Test
    public void test3() {
        assertListNodesEqual(null, solution.removeElements(null, 1));
    }

    @Test
    public void test4() {
        assertListNodesEqual(createList(2), solution.removeElements(createList(1, 2), 1));
    }

    @Test
    public void test5() {
        assertListNodesEqual(createList(2), solution.removeElements(createList(2, 1), 1));
    }
}
