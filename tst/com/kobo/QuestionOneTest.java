package com.kobo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QuestionOneTest {

    private QuestionOne solution;

    @Before
    public void before() {
        solution = new QuestionOne();
    }

    @Test
    public void nullInput() {
        assertNull(solution.reverse(null));
    }

    @Test
    public void emptyInput() {
        assertTrue(solution.reverse("").isEmpty());
    }

    @Test
    public void singleCharacterInput() {
        assertEquals("a", solution.reverse("a"));
    }

    @Test
    public void moreInput() {
        assertEquals("ba", solution.reverse("ab"));
    }

    @Test
    public void evenMoreInput() {
        assertEquals("abcde", solution.reverse("edcba"));
    }
}