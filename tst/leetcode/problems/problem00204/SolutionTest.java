package leetcode.problems.problem00204;

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
        assertEquals(0, solution.countPrimes(0));
    }

    @Test
    public void test2() {
        assertEquals(0, solution.countPrimes(1));
    }

    @Test
    public void test3() {
        assertEquals(0, solution.countPrimes(2));
    }

    @Test
    public void test4() {
        assertEquals(1, solution.countPrimes(3));
    }

    @Test
    public void test5() {
        assertEquals(2, solution.countPrimes(4));
    }

    @Test
    public void test6() {
        assertEquals(2, solution.countPrimes(5));
    }

    @Test
    public void test7() {
        assertEquals(3, solution.countPrimes(6));
    }

    @Test
    public void test8() {
        assertEquals(8, solution.countPrimes(22));
    }

    @Test
    public void test9() {
        assertEquals(41537, solution.countPrimes(499979));
    }
}
