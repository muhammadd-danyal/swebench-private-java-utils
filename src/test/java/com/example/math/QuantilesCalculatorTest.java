package com.example.math;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
//import java.util.Collections;
import java.util.List;

class QuantilesCalculatorTest {

    // ---------- F2P: new behavior that will fail until implemented ----------

    @Test
    void percentile_basic_nearestRank() {
        // Sorted 1..10; p=90 -> rank=ceil(0.9*10)=9 -> 9th element is 9
        List<Integer> vals = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        double p90 = MathUtils.percentile(vals, 90.0);
        Assertions.assertEquals(9.0, p90, 1e-9);
    }

    @Test
    void percentile_zeroAndHundred_areMinAndMax() {
        List<Integer> vals = Arrays.asList(3, 1, null, 7, 5);
        // null ignored -> [1,3,5,7]
        Assertions.assertEquals(1.0, MathUtils.percentile(vals, 0.0), 1e-9);
        Assertions.assertEquals(7.0, MathUtils.percentile(vals, 100.0), 1e-9);
    }

    @Test
    void percentile_throwsForInvalidP() {
        List<Integer> vals = Arrays.asList(1,2,3);
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> MathUtils.percentile(vals, -1));
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> MathUtils.percentile(vals, 100.1));
    }

    // ---------- P2P: existing behavior that should pass now and later --------

    @Test
    void p2p_average_smoke() {
        Assertions.assertEquals(4.0, MathUtils.average(Arrays.asList(2,4,6)), 1e-9);
    }
}
