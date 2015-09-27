package leetcode.problems.problem00002;

import static leetcode.problems.common.TestUtils.assertListNodesEqual;
import static leetcode.problems.common.TestUtils.createList;

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
        ListNode list1 = createList(2, 4, 3);
        ListNode list2 = createList(5, 6, 4);
        ListNode expectedResult = createList(7, 0, 8);
        ListNode result = solution.addTwoNumbers(list1, list2);

        assertListNodesEqual(expectedResult, result);
    }
}
