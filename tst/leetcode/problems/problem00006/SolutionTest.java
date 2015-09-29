package leetcode.problems.problem00006;

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
        assertEquals("PAHNAPLSIIGYIR", solution.convert("PAYPALISHIRING", 3));
    }

    @Test
    public void test2() {
        assertEquals("", solution.convert(null, 3));
    }

    @Test
    public void test3() {
        assertEquals("", solution.convert("", 3));
    }

    @Test
    public void test4() {
        assertEquals("a", solution.convert("a", 100));
    }

    @Test
    public void test5() {
        assertEquals("abcdefg", solution.convert("abcdefg", 100));
    }

    @Test
    public void test6() {
        assertEquals("AB", solution.convert("AB", 1));
    }
}
