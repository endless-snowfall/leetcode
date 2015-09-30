package leetcode.problems.problem00101;

import static leetcode.problems.common.TestUtils.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;

public class SolutionTest extends TestBase {

    private Solution1 solution;

    @Before
    public void before() {
        solution = new Solution1();
    }

    @Test
    public void test1() {
        assertTrue(solution.isSymmetric(null));
    }

    @Test
    public void test2() {
        assertTrue(solution.isSymmetric(createTree(1)));
    }

    @Test
    public void test3() {
        assertTrue(solution.isSymmetric(createTree(1, 2, 2)));
    }

    @Test
    public void test4() {
        assertFalse(solution.isSymmetric(createTree(1, 2, 3)));
    }

    @Test
    public void test5() {
        assertFalse(solution.isSymmetric(createTree(1, 3, 2)));
    }

    @Test
    public void test6() {
        assertFalse(solution.isSymmetric(createTree(1, null, 2)));
    }

    @Test
    public void test7() {
        assertFalse(solution.isSymmetric(createTree(1, 2, null)));
    }

    @Test
    public void test8() {
        assertTrue(solution.isSymmetric(createTree(1, 2, 2, 3, 4, 4, 3)));
    }

    @Test
    public void test9() {
        assertFalse(solution.isSymmetric(createTree(1, 2, 2, null, 3, null, 3)));
    }
}
