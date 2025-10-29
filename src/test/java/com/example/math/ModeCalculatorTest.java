package com.example.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

class ModeCalculatorTest {

    // F2P #1 (fails in Commit A, passes in Commit B)
    @Test
    void mode_basicFrequency() {
        Assertions.assertEquals(2, MathUtils.mode(Arrays.asList(2,2,1,3)));
    }

    // F2P #2 (fails in Commit A, passes in Commit B)
    @Test
    void mode_tieReturnsSmallest() {
        Assertions.assertEquals(3, MathUtils.mode(Arrays.asList(3,3,7,7,8)));
    }

    // F2P #3 (fails in Commit A, passes in Commit B)
    @Test
    void mode_throwsForNullOrEmpty() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> MathUtils.mode(null));
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> MathUtils.mode(Collections.emptyList()));
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> MathUtils.mode(Arrays.asList(null, null)));
    }
}
