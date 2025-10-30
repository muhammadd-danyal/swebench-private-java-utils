package com.example.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RangeCalculatorTest {

    // P2P #1: Tests RangeCalculator's range method
    @Test
    void range_calculatesUsingCalculator() {
        int result = RangeCalculator.calculateRange(Arrays.asList(1, 2, 3, 4, 5));
        Assertions.assertEquals(4, result);
    }
}
