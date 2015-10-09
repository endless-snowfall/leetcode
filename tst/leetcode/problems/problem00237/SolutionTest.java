package leetcode.problems.problem00237;

import static leetcode.problems.common.TestUtils.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.ListNode;
import leetcode.problems.common.TestBase;

public class SolutionTest extends TestBase {

    private Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        ListNode list = createList(1, 2);
        solution.deleteNode(list);
        assertListNodesEqual(createList(2), list);
    }

    @Test
    public void test2() {
        ListNode list = createList(1, 2, 3, 4, 5);
        solution.deleteNode(list.next);
        assertListNodesEqual(createList(1, 3, 4, 5), list);
    }

    @Test
    public void test3() {
        ListNode list = createList(1, 2, 3, 4, 5);
        solution.deleteNode(list.next.next);
        assertListNodesEqual(createList(1, 2, 4, 5), list);
    }

    @Test
    public void test4() {
        ListNode list = createList(1, 2, 3, 4, 5);
        solution.deleteNode(list.next.next.next);
        assertListNodesEqual(createList(1, 2, 3, 5), list);
    }
}
