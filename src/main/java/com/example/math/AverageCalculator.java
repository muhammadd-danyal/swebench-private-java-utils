package com.example.math;

import java.util.List;

final class AverageCalculator {
    private AverageCalculator() {}

    static double computeAverage(List<Integer> input) {
        List<Integer> data = InputValidator.requireNonNullNonEmptyNonAllNull(input, "numbers");
        long sum = 0;
        for (int v : data) sum += v;
        return sum / (double) data.size();
    }
}
