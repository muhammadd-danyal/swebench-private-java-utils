package com.example.math;

import java.util.List;

final class VarianceCalculator {
    private VarianceCalculator() {}

    static double population(List<Integer> input) {
        List<Integer> data = InputValidator.requireNonNullNonEmptyNonAllNull(input, "values");
        int n = data.size();
        double mean = AverageCalculator.computeAverage(data);
        double sumSq = 0.0;
        for (int v : data) {
            double d = v - mean;
            sumSq += d * d;
        }
        return sumSq / n;
    }

    static double sample(List<Integer> input) {
        List<Integer> data = InputValidator.requireNonNullNonEmptyNonAllNull(input, "values");
        if (data.size() < 2) {
            throw new StatisticsException("sample variance requires at least 2 values");
        }
        int n = data.size();
        double mean = AverageCalculator.computeAverage(data);
        double sumSq = 0.0;
        for (int v : data) {
            double d = v - mean;
            sumSq += d * d;
        }
        return sumSq / (n - 1);
    }
}
