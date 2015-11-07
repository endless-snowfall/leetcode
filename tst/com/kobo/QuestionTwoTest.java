package com.kobo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QuestionTwoTest {

    private QuestionTwo solution;

    @Before
    public void before() {
        solution = new QuestionTwo();
    }

    @Test
    public void nullInput() {
        int[] input = null;
        solution.sortLikeItsFriday(input);
        assertNull(input);
    }

    @Test
    public void singleElementInput() {
        int[] input = new int[] { 1 };
        solution.sortLikeItsFriday(input);
        assertArrayEquals(new int[] { 1 }, input);
    }

    @Test
    public void oneOfEach() {
        int[] input = new int[] { 1, 5, 9 };
        solution.sortLikeItsFriday(input);
        assertArrayEquals(new int[] { 1, 5, 9 }, input);
    }

    @Test
    public void oneOfEachReversed() {
        int[] input = new int[] { 9, 5, 1 };
        solution.sortLikeItsFriday(input);
        assertArrayEquals(new int[] { 1, 5, 9 }, input);
    }

    @Test
    public void test5() {
        int[] input = new int[] { 1, 5, 9, 1, 5, 9 };
        solution.sortLikeItsFriday(input);
        assertArrayEquals(new int[] { 1, 1, 5, 5, 9, 9 }, input);
    }

    @Test
    public void test6() {
        int[] input = new int[] { 1, 1, 1, 1, 1 };
        solution.sortLikeItsFriday(input);
        assertArrayEquals(new int[] { 1, 1, 1, 1, 1 }, input);
    }

    @Test
    public void test7() {
        int[] input = new int[] { 5, 5, 5, 5, 5 };
        solution.sortLikeItsFriday(input);
        assertArrayEquals(new int[] { 5, 5, 5, 5, 5 }, input);
    }

    @Test
    public void test8() {
        int[] input = new int[] { 9, 5, 9, 5, 9 };
        solution.sortLikeItsFriday(input);
        assertArrayEquals(new int[] { 5, 5, 9, 9, 9 }, input);
    }
}
