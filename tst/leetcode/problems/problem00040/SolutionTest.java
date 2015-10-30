package leetcode.problems.problem00040;

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

    private Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertEquals(Collections.EMPTY_LIST, solution.combinationSum2(null, 1));
    }

    @Test
    public void test2() {
        assertEquals(Collections.EMPTY_LIST, solution.combinationSum2(new int[] {}, 1));
    }

    @Test
    public void test3() {
        assertEquals(Collections.EMPTY_LIST, solution.combinationSum2(new int[] { 2 }, 1));
    }

    @Test
    public void test4() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Lists.newArrayList(1));

        assertEquals(expected, solution.combinationSum2(new int[] { 1 }, 1));
    }

    @Test
    public void test5() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Lists.newArrayList(1));

        assertEquals(expected, solution.combinationSum2(new int[] { 1, 2 }, 1));
    }

    @Test
    public void test6() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Lists.newArrayList(1));

        assertEquals(expected, solution.combinationSum2(new int[] { 1, 1, 1, 1, 1, 1 }, 1));
    }

    @Test
    public void test7() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Lists.newArrayList(2));

        assertEquals(expected, solution.combinationSum2(new int[] { 1, 2 }, 2));
    }

    @Test
    public void test8() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Lists.newArrayList(7));

        assertEquals(expected, solution.combinationSum2(new int[] { 2, 3, 6, 7 }, 7));
    }

    @Test
    public void test9() {
        assertEquals(Lists.newArrayList(
            Lists.newArrayList(2, 2, 3),
            Lists.newArrayList(7)),
            solution.combinationSum2(new int[] { 2, 2, 2, 3, 3, 3, 3, 3, 6, 6, 6, 6, 7, 7 }, 7));
    }

    @Test
    public void test10() {
        assertEquals(Lists.newArrayList(
            Lists.newArrayList(3, 8),
            Lists.newArrayList(4, 7)),
            solution.combinationSum2(new int[] { 8, 7, 4, 3 }, 11));
    }

    @Test
    public void test11() {
        assertEquals(Lists.newArrayList(
            Lists.newArrayList(1, 1, 6),
            Lists.newArrayList(1, 2, 5),
            Lists.newArrayList(1, 7),
            Lists.newArrayList(2, 6)),
            solution.combinationSum2(new int[] { 10, 1, 2, 7, 6, 1, 5 }, 8));
    }
}
