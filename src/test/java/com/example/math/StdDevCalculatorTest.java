package com.example.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class StdDevCalculatorTest {

    // F2P #3: population stddev of [2,4,6] = sqrt(8/3)
    @Test
    void stddevPopulation_simple() {
        double s = MathUtils.stddevPopulation(Arrays.asList(2,4,6));
        Assertions.assertEquals(Math.sqrt(8.0/3.0), s, 1e-9);
    }

    // F2P #4: sample stddev of [2,4,6] = sqrt(4) = 2
    @Test
    void stddevSample_simple() {
        double s = MathUtils.stddevSample(Arrays.asList(2,4,6));
        Assertions.assertEquals(2.0, s, 1e-9);
    }
}
