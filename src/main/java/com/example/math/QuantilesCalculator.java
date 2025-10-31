package com.example.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//import java.util.Objects;

final class QuantilesCalculator {
    private QuantilesCalculator() {}

    static double nearestRankPercentile(List<Integer> values, double p) {
        if (p < 0.0 || p > 100.0) {
            throw new IllegalArgumentException("p must be in [0,100]");
        }
        if (values == null || values.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be null or empty");
        }

        List<Integer> filtered = new ArrayList<>();
        for (Integer v : values) {
            if (v != null) filtered.add(v);
        }
        if (filtered.isEmpty()) {
            throw new IllegalArgumentException("All values are null");
        }

        Collections.sort(filtered); // ascending
        int n = filtered.size();

        if (p == 0.0) {
            return filtered.get(0);
        }
        if (p == 100.0) {
            return filtered.get(n - 1);
        }

        double rankDouble = Math.ceil((p / 100.0) * n); // 1-based
        int rank = (int) rankDouble;
        if (rank < 1) rank = 1;
        if (rank > n) rank = n;

        return filtered.get(rank - 1);
    }
}
