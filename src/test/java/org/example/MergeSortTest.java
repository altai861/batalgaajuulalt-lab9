package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.Arrays;

public class MergeSortTest {

    // Test case for a standard unsorted array
    @Test
    void testStandardSort() {
        int[] input = {5, 2, 8, 1, 9, 4};
        int[] expected = {1, 2, 4, 5, 8, 9};
        MergeSort.mergesort(input); // Call the static method directly
        assertArrayEquals(expected, input, "The array should be sorted correctly.");
    }

    // TEST 1
    @Test
    void testMerge() {
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] left = {1, 2, 3, 4, 5, 10, 11, 12};
        int[] right = {6, 7, 8, 9, 10};
        MergeSort.merge(arr, left, right);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 11, 12};

        assertArrayEquals(expected, arr, "The arrays should be merged correctly.");
    }

    // TEST 2
    @Test
    void testMerge2() {
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] left = {20, 21, 22, 40, 50};
        int[] right = {10, 13, 16, 30, 41, 60, 75};
        MergeSort.merge(arr, left, right);
        int[] expected = {10, 13, 16, 20, 21, 22, 30, 40, 41, 50, 60, 75};

        assertArrayEquals(expected, arr, "The arrays should be merged correctly.");
    }
}