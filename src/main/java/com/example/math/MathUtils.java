package com.example.math;

import java.util.List;

public final class MathUtils {
    private MathUtils() {}

    public static double average(List<Integer> numbers) {
        return AverageCalculator.computeAverage(numbers);
    }

    public static double median(List<Integer> values) {
        return MedianCalculator.computeMedian(values);
    }

    // Commit A: will call the stub and therefore fail F2P tests
    public static int mode(List<Integer> values) {
        return ModeCalculator.computeMode(values);
    }
}
