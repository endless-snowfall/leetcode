package leetcode.problems.problem00015;

import static org.junit.Assert.*;

import java.util.ArrayList;
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
        assertTrue(solution.threeSum(null).isEmpty());
    }

    @Test
    public void test2() {
        assertTrue(solution.threeSum(new int[] {}).isEmpty());
    }

    @Test
    public void test3() {
        assertTrue(solution.threeSum(new int[] { 1 }).isEmpty());
    }

    @Test
    public void test4() {
        assertTrue(solution.threeSum(new int[] { 1, 2 }).isEmpty());
    }

    @Test
    public void test5() {
        assertTrue(solution.threeSum(new int[] { 1, 2, 3 }).isEmpty());
    }

    @Test
    public void test6() {
        assertEquals(Lists.newArrayList(
            Lists.newArrayList(-1, -1, 2),
            Lists.newArrayList(-1, 0, 1)),
            solution.threeSum(new int[] { -1, 0, 1, 2, -1, -4 }));
    }

    @Test
    public void test7() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Lists.newArrayList(0, 0, 0));
        assertEquals(expected, solution.threeSum(new int[] { 0, 0, 0 }));
    }

    @Test
    public void test8() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Lists.newArrayList(0, 0, 0));
        assertEquals(expected, solution.threeSum(new int[] { 0, 0, 0, 0 }));
    }

    @Test
    public void test9() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Lists.newArrayList(Integer.MIN_VALUE, 1, Integer.MAX_VALUE));
        assertEquals(expected, solution.threeSum(new int[] { Integer.MIN_VALUE, 1, Integer.MAX_VALUE }));
    }

    @Test
    public void test10() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Lists.newArrayList(Integer.MIN_VALUE, 1, Integer.MAX_VALUE));
        assertEquals(expected, solution.threeSum(
            new int[] { Integer.MIN_VALUE, Integer.MIN_VALUE, -10000, 1, Integer.MAX_VALUE }));
    }

    @Test
    public void test11() {
        assertTrue(solution.threeSum(new int[] { 1, 1, Integer.MAX_VALUE }).isEmpty());
    }
}
