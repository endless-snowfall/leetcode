package leetcode.problems.problem00039;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;

import leetcode.problems.common.TestBase;

@SuppressWarnings("unchecked")
public class SolutionTest extends TestBase {

    private ConciseSolution solution;

    @Before
    public void before() {
        solution = new ConciseSolution();
    }

    @Test
    public void test1() {
        assertEquals(Collections.EMPTY_LIST, solution.combinationSum(null, 1));
    }

    @Test
    public void test2() {
        assertEquals(Collections.EMPTY_LIST, solution.combinationSum(new int[] {}, 1));
    }

    @Test
    public void test3() {
        assertEquals(Collections.EMPTY_LIST, solution.combinationSum(new int[] { 2 }, 1));
    }

    @Test
    public void test4() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Lists.newArrayList(1));

        assertEquals(expected, solution.combinationSum(new int[] { 1 }, 1));
    }

    @Test
    public void test5() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Lists.newArrayList(1));

        assertEquals(expected, solution.combinationSum(new int[] { 1, 2 }, 1));
    }

    @Test
    public void test6() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Lists.newArrayList(1));

        assertEquals(expected, solution.combinationSum(new int[] { 1, 1, 1, 1, 1, 1 }, 1));
    }

    @Test
    public void test7() {
        assertEquals(Lists.newArrayList(
            Lists.newArrayList(1, 1),
            Lists.newArrayList(2)),
            solution.combinationSum(new int[] { 1, 2 }, 2));
    }

    @Test
    public void test8() {
        assertEquals(Lists.newArrayList(
            Lists.newArrayList(2, 2, 3),
            Lists.newArrayList(7)),
            solution.combinationSum(new int[] { 2, 3, 6, 7 }, 7));
    }

    @Test
    public void test9() {
        assertEquals(Lists.newArrayList(
            Lists.newArrayList(2, 2, 3),
            Lists.newArrayList(7)),
            solution.combinationSum(new int[] { 2, 2, 2, 3, 3, 3, 3, 3, 6, 6, 6, 6, 7, 7 }, 7));
    }

    @Test
    public void test10() {
        assertEquals(Lists.newArrayList(
            Lists.newArrayList(3, 4, 4),
            Lists.newArrayList(3, 8),
            Lists.newArrayList(4, 7)),
            solution.combinationSum(new int[] { 8, 7, 4, 3 }, 11));
    }
}
