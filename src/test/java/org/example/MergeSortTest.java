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

    // Test case for an already sorted array
    @Test
    void testAlreadySortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        MergeSort.mergesort(input);
        assertArrayEquals(expected, input, "An already sorted array should remain the same.");
    }

    // Test case for a reverse-sorted array
    @Test
    void testReverseSortedArray() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        MergeSort.mergesort(input);
        assertArrayEquals(expected, input, "A reverse-sorted array should be correctly sorted.");
    }

    // Test case for an array with duplicate elements
    @Test
    void testArrayWithDuplicates() {
        int[] input = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        int[] expected = {1, 1, 2, 3, 3, 4, 5, 5, 6, 9};
        MergeSort.mergesort(input);
        assertArrayEquals(expected, input, "The array should handle duplicate elements.");
    }

    // Test case for an array with a single element
    @Test
    void testSingleElementArray() {
        int[] input = {42};
        int[] expected = {42};
        MergeSort.mergesort(input);
        assertArrayEquals(expected, input, "A single-element array should remain the same.");
    }

    // Test case for an empty array
    @Test
    void testEmptyArray() {
        int[] input = {};
        int[] expected = {};
        MergeSort.mergesort(input);
        assertArrayEquals(expected, input, "An empty array should remain empty.");
    }
}