package leetcode.problems.problem00133;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;

public class SolutionTest extends TestBase {

    private RecursiveSolution solution;

    @Before
    public void before() {
        solution = new RecursiveSolution();
    }

    @Test
    public void test1() {
        assertNull(solution.cloneGraph(null));
    }
}
