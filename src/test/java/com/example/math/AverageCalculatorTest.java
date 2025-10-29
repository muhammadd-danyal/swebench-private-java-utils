package com.example.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

class AverageCalculatorTest {

    // P2P #1
    @Test
    void average_returnsMeanForSimpleList() {
        double r = MathUtils.average(Arrays.asList(2, 4, 6));
        Assertions.assertEquals(4.0, r, 1e-9);
    }

    // P2P #2
    @Test
    void average_ignoresNulls() {
        double r = MathUtils.average(Arrays.asList(2, null, 4));
        Assertions.assertEquals(3.0, r, 1e-9);
    }

    // P2P #3
    @Test
    void average_throwsForEmptyOrAllNull() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> MathUtils.average(Collections.emptyList()));
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> MathUtils.average(Arrays.asList(null, null)));
    }
}
