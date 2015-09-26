package leetcode.problems.problem00003;

import static org.junit.Assert.assertEquals;

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
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void test2() {
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void test3() {
        assertEquals(0, solution.lengthOfLongestSubstring(""));
    }

    @Test
    public void test4() {
        assertEquals(1, solution.lengthOfLongestSubstring("a"));
    }

    @Test
    public void test5() {
        assertEquals(2, solution.lengthOfLongestSubstring("au"));
    }

    @Test
    public void test6() {
        assertEquals(7, solution.lengthOfLongestSubstring("abcdefgabc"));
    }

    @Test
    public void test7() {
        assertEquals(7, solution.lengthOfLongestSubstring("abcabcdefg"));
    }

    @Test
    public void test8() {
        assertEquals(2, solution.lengthOfLongestSubstring("abba"));
    }
}
