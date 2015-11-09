package leetcode.problems.problem00222;

import static leetcode.problems.common.TestUtils.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;

public class SolutionTest extends TestBase {

    private ConciseSolution2 solution;

    @Before
    public void before() {
        solution = new ConciseSolution2();
    }

    @Test
    public void test1() {
        assertEquals(0, solution.countNodes(null));
    }

    @Test
    public void test2() {
        assertEquals(1, solution.countNodes(createTree(1)));
    }

    @Test
    public void test3() {
        assertEquals(3, solution.countNodes(createTree(1, 2, 3)));
    }

    @Test
    public void test4() {
        assertEquals(2, solution.countNodes(createTree(1, 2, null)));
    }

    @Test
    public void test5() {
        assertEquals(7, solution.countNodes(createTree(1, 2, 3, 4, 5, 6, 7)));
    }

    @Test
    public void test6() {
        assertEquals(6, solution.countNodes(createTree(1, 2, 3, 4, 5, 6, null)));
    }

    @Test
    public void test7() {
        assertEquals(5, solution.countNodes(createTree(1, 2, 3, 4, 5, null, null)));
    }

    @Test
    public void test8() {
        assertEquals(4, solution.countNodes(createTree(1, 2, 3, 4, null, null, null)));
    }

    @Test
    public void test9() {
        assertEquals(15, solution.countNodes(createTree(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)));
    }

    @Test
    public void test10() {
        assertEquals(14, solution.countNodes(createTree(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, null)));
    }

    @Test
    public void test11() {
        assertEquals(13, solution.countNodes(createTree(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, null, null)));
    }

    @Test
    public void test12() {
        assertEquals(12, solution.countNodes(createTree(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, null, null, null)));
    }

    @Test
    public void test13() {
        assertEquals(11, solution.countNodes(createTree(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, null, null, null, null)));
    }

    @Test
    public void test14() {
        assertEquals(10, solution.countNodes(createTree(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, null, null, null, null, null)));
    }

    @Test
    public void test15() {
        assertEquals(9, solution.countNodes(createTree(1, 2, 3, 4, 5, 6, 7, 8, 9, null, null, null, null, null, null)));
    }

    @Test
    public void test16() {
        assertEquals(8, solution.countNodes(createTree(1, 2, 3, 4, 5, 6, 7, 8, null, null, null, null, null, null, null)));
    }

    @Test
    public void test17() {
        assertEquals(24, solution.countNodes(
            createTree(
                1,
                2, 3,
                4, 5, 6, 7,
                8, 9, 10, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20, 21, 22, 23, 24, null, null, null, null, null, null, null)));
    }

    @Test
    public void test18() {
        assertEquals(1, solution.countNodes(createTree(1)));
    }
}
