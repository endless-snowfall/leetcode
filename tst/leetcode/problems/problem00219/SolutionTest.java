package leetcode.problems.problem00219;

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
        assertFalse(solution.containsNearbyDuplicate(null, 1));
    }

    @Test
    public void test2() {
        assertFalse(solution.containsNearbyDuplicate(new int[] {}, 1));
    }

    @Test
    public void test3() {
        assertTrue(solution.containsNearbyDuplicate(new int[] { 1 }, 0));
    }

    @Test
    public void test4() {
        assertFalse(solution.containsNearbyDuplicate(new int[] { 1, 2, 3, 4, 5, 6 }, 1));
    }

    @Test
    public void test5() {
        assertFalse(solution.containsNearbyDuplicate(new int[] { 1, 2, 1 }, 1));
    }

    @Test
    public void test6() {
        assertTrue(solution.containsNearbyDuplicate(new int[] { 1, 2, 1 }, 2));
    }

    @Test
    public void test7() {
        for (int i = 1; i <= 8; i++) {
            assertFalse(solution.containsNearbyDuplicate(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1 }, i));
        }
        assertTrue(solution.containsNearbyDuplicate(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1 }, 9));
    }
}
