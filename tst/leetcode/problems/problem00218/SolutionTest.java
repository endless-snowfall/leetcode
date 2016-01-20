package leetcode.problems.problem00218;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;

public class SolutionTest {

    private HeapSolution solution;

    @Before
    public void before() {
        solution = new HeapSolution();
    }

    @Test
    public void test1() {
        assertTrue(solution.getSkyline(null).isEmpty());
    }

    @Test
    public void test2() {
        assertTrue(solution.getSkyline(new int[][] {}).isEmpty());
    }

    @Test
    public void test3() {
        int[][] input = {
            { 2, 9, 10 },
            { 3, 7, 15 },
            { 5, 12, 12 },
            { 15, 20, 10 },
            { 19, 24, 8 }
        };

        assertListOfArraysEquals(
            Lists.newArrayList(
                new int[] { 2, 10 },
                new int[] { 3, 15 },
                new int[] { 7, 12 },
                new int[] { 12, 0 },
                new int[] { 15, 10 },
                new int[] { 20, 8 },
                new int[] { 24, 0 }),
            solution.getSkyline(input));
    }

    @Test
    public void test4() {
        int[][] input = {
            { 0, 2, 3 },
            { 2, 5, 3 }
        };

        assertListOfArraysEquals(
            Lists.newArrayList(
                new int[] { 0, 3 },
                new int[] { 5, 0 }),
            solution.getSkyline(input));
    }

    @Test
    public void test5() {
        int[][] input = {
            { 1, 2, 1 },
            { 1, 2, 2 },
            { 1, 2, 3 }
        };

        assertListOfArraysEquals(
            Lists.newArrayList(
                new int[] { 1, 3 },
                new int[] { 2, 0 }),
            solution.getSkyline(input));
    }

    private void assertListOfArraysEquals(List<int[]> expected, List<int[]> actual) {
        assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            assertArrayEquals(expected.get(i), actual.get(i));
        }
    }
}
