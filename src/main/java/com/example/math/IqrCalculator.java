package com.example.math;

import java.util.List;

final class IqrCalculator {
    private IqrCalculator() {}

    static double compute(List<Integer> values) {
        // Delegates to nearest-rank percentile
        double q1 = QuantilesCalculator.nearestRankPercentile(values, 25.0);
        double q3 = QuantilesCalculator.nearestRankPercentile(values, 75.0);
        return q3 - q1;
    }
}
