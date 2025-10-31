package com.example.math;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class IqrCalculatorTest {

    // F2P
    @Test
    void iqr_basic() {
        // [1..8]; Q3=percentile(75)=6, Q1=percentile(25)=2 -> IQR=4
        List<Integer> vals = Arrays.asList(1,2,3,4,5,6,7,8);
        Assertions.assertEquals(4.0, MathUtils.iqr(vals), 1e-9);
    }

    // F2P
    @Test
    void iqr_throwsForNullEmptyAllNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> MathUtils.iqr(null));
        Assertions.assertThrows(IllegalArgumentException.class, () -> MathUtils.iqr(Collections.emptyList()));
        Assertions.assertThrows(IllegalArgumentException.class, () -> MathUtils.iqr(Arrays.asList(null,null)));
    }

    // P2P
    @Test
    void p2p_varianceSample_throwsForInsufficientData() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> MathUtils.varianceSample(Arrays.asList(5)));
    }
}
