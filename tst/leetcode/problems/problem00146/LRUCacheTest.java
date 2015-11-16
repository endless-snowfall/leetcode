package leetcode.problems.problem00146;

import static org.junit.Assert.*;

import org.junit.Test;

import leetcode.problems.common.TestBase;

public class LRUCacheTest extends TestBase {

    private static final int NO_RESULT = -1;

    private LRUCache cache;

    @Test
    public void test1() {
        cache = new LRUCache(0);
        assertEquals(NO_RESULT, cache.get(1));
    }

    @Test
    public void test2() {
        cache = new LRUCache(1);
        assertEquals(NO_RESULT, cache.get(1));

        cache.set(1, 2);
        assertEquals(2, cache.get(1));
    }

    @Test
    public void test3() {
        cache = new LRUCache(1);
        assertEquals(NO_RESULT, cache.get(1));

        cache.set(1, 2);
        assertEquals(2, cache.get(1));

        cache.set(3, 4);
        assertEquals(4, cache.get(3));
        assertEquals(NO_RESULT, cache.get(1));
        assertEquals(4, cache.get(3));
    }
}
