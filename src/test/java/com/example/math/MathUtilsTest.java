package com.example.math;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class MathUtilsTest {

    // P2P #1: basic average computation
    @Test
    void average_returnsMeanForSimpleList() {
        double result = MathUtils.average(Arrays.asList(2, 4, 6));
        Assertions.assertEquals(4.0, result, 1e-9);
    }

    // P2P #2: ignores null values while averaging
    @Test
    void average_ignoresNulls() {
        double result = MathUtils.average(Arrays.asList(2, null, 4));
        Assertions.assertEquals(3.0, result, 1e-9);
    }

    // P2P #3: throws when list is empty or all elements are null
    @Test
    void average_throwsForEmptyOrAllNull() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> MathUtils.average(Collections.emptyList()));
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> MathUtils.average(Arrays.asList(null, null)));
    }

    // P2P #4: median for odd-sized list returns the middle element
    @Test
    void median_returnsMiddleForOddSizedList() {
        List<Integer> vals = Arrays.asList(1, 3, 5);
        Assertions.assertEquals(3.0, MathUtils.median(vals), 1e-9);
    }

    // F2P: median for even-sized list should be average of the two middle values
    // (Fails on base/before implementation; passes after the fix in this PR)
    @Test
    void median_evenSizedList_shouldBeAverageOfTwoMiddles() {
        List<Integer> vals = Arrays.asList(1, 2, 4, 100);
        Assertions.assertEquals(3.0, MathUtils.median(vals), 1e-9);
    }

    @Test
    void range_calculatesCorrectly() {
        int result = MathUtils.range(Arrays.asList(1, 2, 3, 4, 5));
        Assertions.assertEquals(4, result);
    }

    // F2P #1: Range with empty list should throw exception
    @Test
    void range_throwsForEmpty() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> MathUtils.range(Collections.emptyList()));
    }

    // F2P #2: Range with null list should throw exception
    @Test
    void range_throwsForNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> MathUtils.range(null));
    }

    // F2P #3: Range with all null values should throw exception
    @Test
    void range_throwsForAllNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> MathUtils.range(Arrays.asList(null, null, null)));
    }
}