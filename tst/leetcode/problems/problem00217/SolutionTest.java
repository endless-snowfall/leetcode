package leetcode.problems.problem00217;

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
        assertFalse(solution.containsDuplicate(null));
    }

    @Test
    public void test2() {
        assertFalse(solution.containsDuplicate(new int[] {}));
    }

    @Test
    public void test3() {
        assertFalse(solution.containsDuplicate(new int[] { 1 }));
    }

    @Test
    public void test4() {
        assertFalse(solution.containsDuplicate(new int[] { 5, 4, 3, 2, 1 }));
    }

    @Test
    public void test5() {
        assertTrue(solution.containsDuplicate(new int[] { 5, 4, 3, 2, 1, 5 }));
    }

    @Test
    public void test6() {
        assertTrue(solution.containsDuplicate(new int[] { 1, 1 }));
    }
}
