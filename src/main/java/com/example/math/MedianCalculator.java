package com.example.math;

import java.util.Collections;
import java.util.List;

final class MedianCalculator {
    private MedianCalculator() {}

    static double computeMedian(List<Integer> input) {
        List<Integer> data = InputValidator.requireNonNullNonEmptyNonAllNull(input, "values");
        Collections.sort(data);
        int n = data.size();
        int mid = n / 2;
        if ((n & 1) == 1) return data.get(mid);
        return (data.get(mid - 1) + data.get(mid)) / 2.0;
    }
}
