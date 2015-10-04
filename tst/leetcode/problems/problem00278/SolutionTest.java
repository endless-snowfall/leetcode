package leetcode.problems.problem00278;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import leetcode.problems.common.TestBase;

@RunWith(MockitoJUnitRunner.class)
public class SolutionTest extends TestBase {

    @Spy private Solution solution;

    @Test
    public void test1() {
        mockVersionControl(true);
        assertEquals(1, solution.firstBadVersion(1));
    }

    @Test
    public void test2() {
        mockVersionControl(false, true);
        assertEquals(2, solution.firstBadVersion(2));
    }

    @Test
    public void test3() {
        mockVersionControl(true, true);
        assertEquals(1, solution.firstBadVersion(2));
    }

    @Test
    public void test4() {
        mockVersionControl(false, false, false, false, false, true, true, true, true);
        assertEquals(6, solution.firstBadVersion(9));
    }

    private void mockVersionControl(boolean... areBadVersions) {
        for (int i = 0; i < areBadVersions.length; i++) {
            doReturn(areBadVersions[i]).when(solution).isBadVersion(i + 1);
        }
    }
}
