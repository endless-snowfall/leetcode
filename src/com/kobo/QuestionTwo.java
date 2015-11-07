package com.kobo;

import java.util.Arrays;

public class QuestionTwo {

    /*
     * Question: You are given list of size N that contains only numbers 1, 5, 9
     * populated randomly; Write a working program that will sort a given list
     * using optimal space and speed.
     *
     * Approach: Going to use bucket sort since the range of the numbers is
     * small.
     *
     * Definitions: n is the size of the input array.
     *
     * Runtime Analysis: Space: O(1) for bucket array. Time: O(n) for the
     * initial process to calculate bucket counts. O(n) to generate the final
     * result from the bucket counts. Overall O(n) runtime, linear.
     */

    public void sortLikeItsFriday(int[] input) {
        if (input == null || input.length < 2) {
            return;
        }

        int[] buckets = new int[3];
        Arrays.stream(input).forEach(num -> addToBucket(num, buckets));
        generateResult(input, buckets);
    }

    private void addToBucket(int num, int[] buckets) {
        buckets[num / 4] += 1;
    }

    private void generateResult(int[] input, int[] buckets) {
        int startIndexFives = buckets[0];
        int startIndexNines = startIndexFives + buckets[1];

        Arrays.fill(input, 0, startIndexFives, 1);
        Arrays.fill(input, startIndexFives, startIndexNines, 5);
        Arrays.fill(input, startIndexNines, input.length, 9);
    }
}
