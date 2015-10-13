package leetcode.problems.problem00118;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;

import leetcode.problems.common.TestBase;

@SuppressWarnings("unchecked")
public class SolutionTest extends TestBase {

    private Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertTrue(solution.generate(-1).isEmpty());
    }

    @Test
    public void test2() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        assertEquals(expected, solution.generate(1));
    }

    @Test
    public void test3() {
        assertEquals(Lists.newArrayList(
            Lists.newArrayList(1),
            Lists.newArrayList(1, 1)),
            solution.generate(2));
    }

    @Test
    public void test4() {
        assertEquals(Lists.newArrayList(
            Lists.newArrayList(1),
            Lists.newArrayList(1, 1),
            Lists.newArrayList(1, 2, 1)),
            solution.generate(3));
    }

    @Test
    public void test5() {
        assertEquals(Lists.newArrayList(
            Lists.newArrayList(1),
            Lists.newArrayList(1, 1),
            Lists.newArrayList(1, 2, 1),
            Lists.newArrayList(1, 3, 3, 1)),
            solution.generate(4));
    }

    @Test
    public void test6() {
        assertEquals(Lists.newArrayList(
            Lists.newArrayList(1),
            Lists.newArrayList(1, 1),
            Lists.newArrayList(1, 2, 1),
            Lists.newArrayList(1, 3, 3, 1),
            Lists.newArrayList(1, 4, 6, 4, 1)),
            solution.generate(5));
    }

    @Test
    public void test7() {
        assertEquals(Lists.newArrayList(
            Lists.newArrayList(1),
            Lists.newArrayList(1, 1),
            Lists.newArrayList(1, 2, 1),
            Lists.newArrayList(1, 3, 3, 1),
            Lists.newArrayList(1, 4, 6, 4, 1),
            Lists.newArrayList(1, 5, 10, 10, 5, 1)),
            solution.generate(6));
    }
}
