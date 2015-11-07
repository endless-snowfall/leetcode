package com.kobo;

public class QuestionOne {

    /*
     * Question: You are given a random string; write a working program that
     * will reverse the string using optimal space and speed. Do not make use in
     * build in Java functions!
     *
     * Approach: Going to use a char array and copy out the chars from the input
     * one at a time in reverse. Then I'm going to return a new result String
     * from this array.
     *
     * Definitions: n is the length of the input string.
     *
     * Runtime Analysis: Space is O(n). Time is O(n).
     */

    public String reverse(String input) {
        if (input == null || input.length() < 2) {
            return input;
        }

        int length = input.length();
        char[] resultChars = new char[length];

        for (int i = 0; i < length; i++) {
            resultChars[length - 1 - i] = input.charAt(i);
        }

        return String.valueOf(resultChars);
    }
}
