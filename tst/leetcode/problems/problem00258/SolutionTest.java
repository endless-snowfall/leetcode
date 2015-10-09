package leetcode.problems.problem00258;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    private Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertEquals(2, solution.addDigits(38));
    }

    @Test
    public void test2() {
        assertEquals(-1, solution.addDigits(-1));
    }

    @Test
    public void test3() {
        assertEquals(0, solution.addDigits(0));
    }

    @Test
    public void test4() {
        assertEquals(1, solution.addDigits(1));
    }

    @Test
    public void test5() {
        assertEquals(9, solution.addDigits(9));
    }

    @Test
    public void test6() {
        assertEquals(1, solution.addDigits(10));
    }

    @Test
    public void test7() {
        assertEquals(1, solution.addDigits(Integer.MAX_VALUE));
    }
}
