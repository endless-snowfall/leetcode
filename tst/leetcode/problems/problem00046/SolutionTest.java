package leetcode.problems.problem00046;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;

import leetcode.problems.common.TestBase;
import leetcode.problems.common.TestUtils;

@SuppressWarnings("unchecked")
public class SolutionTest extends TestBase {

    private Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertTrue(solution.permute(null).isEmpty());
    }

    @Test
    public void test2() {
        assertEquals(Lists.newArrayList(
            new ArrayList<>()),
            solution.permute(new int[] {}));
    }

    @Test
    public void test3() {
        List<List<Integer>> expected = Lists.newArrayList();
        expected.add(Lists.newArrayList(1));
        assertEquals(expected, solution.permute(new int[] { 1 }));
    }

    @Test
    public void test4() {
        assertEquals(Lists.newArrayList(
            Lists.newArrayList(1, 2),
            Lists.newArrayList(2, 1)),
            solution.permute(new int[] { 1, 2 }));
    }

    @Test
    public void test5() {
        TestUtils.assertListsEqualUnordered(Lists.newArrayList(
            Lists.newArrayList(1, 2, 3),
            Lists.newArrayList(1, 3, 2),
            Lists.newArrayList(2, 1, 3),
            Lists.newArrayList(2, 3, 1),
            Lists.newArrayList(3, 1, 2),
            Lists.newArrayList(3, 2, 1)),
            solution.permute(new int[] { 1, 2, 3 }));
    }
}
