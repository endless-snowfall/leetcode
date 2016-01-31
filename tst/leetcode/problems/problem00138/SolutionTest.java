package leetcode.problems.problem00138;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    private ConciseSolution solution;

    @Before
    public void before() {
        solution = new ConciseSolution();
    }

    @Test
    public void test() {
        assertArrayEquals(new int[] { 3, 5 }, solution.singleNumber(new int[] { 1, 2, 1, 3, 2, 5 }));
    }
}
