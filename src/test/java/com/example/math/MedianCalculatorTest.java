package com.example.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MedianCalculatorTest {

    // P2P #4
    @Test
    void median_returnsMiddleForOddSizedList() {
        Assertions.assertEquals(3.0, MathUtils.median(Arrays.asList(1,3,5)), 1e-9);
    }

    // P2P #5
    @Test
    void median_evenSizedList_shouldBeAverageOfTwoMiddles() {
        Assertions.assertEquals(3.0, MathUtils.median(Arrays.asList(1,2,4,100)), 1e-9);
    }
}
