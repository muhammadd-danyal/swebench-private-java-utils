package com.example.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MathUtilsIntegrationTest {

    // P2P #6 (facade behavior)
    @Test
    void integration_average_median_sanity() {
        Assertions.assertEquals(4.0, MathUtils.average(Arrays.asList(2,4,6)), 1e-9);
        Assertions.assertEquals(2.5, MathUtils.median(Arrays.asList(1,2,3,4)), 1e-9);
    }
}
