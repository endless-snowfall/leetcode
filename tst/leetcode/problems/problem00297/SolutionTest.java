package leetcode.problems.problem00297;

import static leetcode.problems.common.TestUtils.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;

public class SolutionTest extends TestBase {

    private Codec solution;

    @Before
    public void before() {
        solution = new Codec();
    }

    @Test
    public void serialize1() {
        assertEquals("#", solution.serialize(null));
    }

    @Test
    public void serialize2() {
        assertEquals("1,#,#", solution.serialize(createTree(1)));
    }

    @Test
    public void serialize3() {
        assertEquals("1,2,#,#,#", solution.serialize(createTree(1, 2, null)));
    }

    @Test
    public void serialize4() {
        assertEquals("1,#,2,#,#", solution.serialize(createTree(1, null, 2)));
    }

    @Test
    public void serialize5() {
        assertEquals("1,2,#,#,3,#,#", solution.serialize(createTree(1, 2, 3)));
    }

    @Test
    public void serialize6() {
        assertEquals("1,2,3,#,#,#,#", solution.serialize(createTree(1, 2, null, 3, null)));
    }

    @Test
    public void deserialize1() {
        assertTreesEquals(null, solution.deserialize("#"));
    }

    @Test
    public void deserialize2() {
        assertTreesEquals(createTree(1), solution.deserialize("1,#,#"));
    }

    @Test
    public void deserialize3() {
        assertTreesEquals(createTree(1, 2, null), solution.deserialize("1,2,#,#,#"));
    }

    @Test
    public void deserialize4() {
        assertTreesEquals(createTree(1, null, 2), solution.deserialize("1,#,2,#,#"));
    }

    @Test
    public void deserialize5() {
        assertTreesEquals(createTree(1, 2, 3), solution.deserialize("1,2,#,#,3,#,#"));
    }

    @Test
    public void deserialize6() {
        assertTreesEquals(createTree(1, 2, null, 3, null), solution.deserialize("1,2,3,#,#,#,#"));
    }
}
