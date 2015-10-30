package leetcode.problems.problem00049;

import static leetcode.problems.common.TestUtils.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;

import leetcode.problems.common.TestBase;

@SuppressWarnings("unchecked")
public class SolutionTest extends TestBase {

    private Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertTrue(solution.groupAnagrams(null).isEmpty());
    }

    @Test
    public void test2() {
        assertTrue(solution.groupAnagrams(new String[] {}).isEmpty());
    }

    @Test
    public void test3() {
        List<List<String>> expected = new ArrayList<>();
        expected.add(Lists.newArrayList("abc"));

        assertEquals(expected, solution.groupAnagrams(new String[] { "abc" }));
    }

    @Test
    public void test4() {
        assertListsEqualUnordered(Lists.newArrayList(
            Lists.newArrayList("ate", "eat", "tea"),
            Lists.newArrayList("nat", "tan"),
            Lists.newArrayList("bat")),
            solution.groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" }));
    }
}
