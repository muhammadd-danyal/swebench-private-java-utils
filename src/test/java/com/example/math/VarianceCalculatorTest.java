package com.example.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

class VarianceCalculatorTest {

    // F2P #1: population variance of [2,4,6] = 8/3
    @Test
    void variancePopulation_simple() {
        double v = MathUtils.variancePopulation(Arrays.asList(2,4,6));
        Assertions.assertEquals(8.0/3.0, v, 1e-9);
    }

    // F2P #2: sample variance of [2,4,6] = 4.0
    @Test
    void varianceSample_simple() {
        double v = MathUtils.varianceSample(Arrays.asList(2,4,6));
        Assertions.assertEquals(4.0, v, 1e-9);
    }

    // P2P: exceptions
    @Test
    void variance_throwsForInvalidInputs() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> MathUtils.variancePopulation(null));
        Assertions.assertThrows(IllegalArgumentException.class, () -> MathUtils.variancePopulation(Collections.emptyList()));
        Assertions.assertThrows(IllegalArgumentException.class, () -> MathUtils.variancePopulation(Arrays.asList(null, null)));

        // sample requires at least 2 non-null values
        Assertions.assertThrows(IllegalArgumentException.class, () -> MathUtils.varianceSample(Arrays.asList(5)));
        Assertions.assertThrows(IllegalArgumentException.class, () -> MathUtils.varianceSample(Arrays.asList(null, 7)));
    }
}
