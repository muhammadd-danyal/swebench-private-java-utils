package com.example.math;

import java.util.List;

final class RangeCalculator {
    private RangeCalculator() {}

    static int calculateRange(List<Integer> values) {
        // Call the MathUtils facade, which currently throws UnsupportedOperationException.
        return MathUtils.range(values);
    }
}
