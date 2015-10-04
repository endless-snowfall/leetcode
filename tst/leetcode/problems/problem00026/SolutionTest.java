package leetcode.problems.problem00026;

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
        assertEquals(0, solution.removeDuplicates(null));
    }

    @Test
    public void test2() {
        assertEquals(0, solution.removeDuplicates(new int[] {}));
    }

    @Test
    public void test3() {
        assertEquals(1, solution.removeDuplicates(new int[] { 1 }));
    }

    @Test
    public void test4() {
        assertEquals(3, solution.removeDuplicates(new int[] { 1, 2, 3 }));
    }

    @Test
    public void test5() {
        assertEquals(2, solution.removeDuplicates(new int[] { 1, 1, 2 }));
    }
}
