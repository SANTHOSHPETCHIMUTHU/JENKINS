package com.example;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class BubbleSortTest {
    @Test
    public void testBubbleSort() {
        int[] input = {5, 1, 4, 2, 8};
        int[] expected = {1, 2, 4, 5, 8};
        BubbleSort.bubbleSort(input);
        assertArrayEquals(expected, input);
    }
}
