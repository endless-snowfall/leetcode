package leetcode.problems.problem00083;

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
        assertNull(solution.deleteDuplicates(null));
    }

    @Test
    public void test2() {
        assertListNodesEqual(createList(1), solution.deleteDuplicates(createList(1)));
    }

    @Test
    public void test3() {
        assertListNodesEqual(createList(1, 2, 3), solution.deleteDuplicates(createList(1, 2, 3)));
    }

    @Test
    public void test4() {
        assertListNodesEqual(createList(1), solution.deleteDuplicates(createList(1, 1)));
    }

    @Test
    public void test5() {
        assertListNodesEqual(createList(1, 2), solution.deleteDuplicates(createList(1, 1, 2)));
    }

    @Test
    public void test6() {
        assertListNodesEqual(createList(1, 2), solution.deleteDuplicates(createList(1, 2, 2)));
    }

    @Test
    public void test7() {
        assertListNodesEqual(createList(1, 2, 3), solution.deleteDuplicates(createList(1, 1, 2, 3, 3)));
    }
}
