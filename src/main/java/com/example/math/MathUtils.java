package com.example.math;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

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

    public static double variancePopulation(List<Integer> values) {
    return VarianceCalculator.population(values);
}
public static double varianceSample(List<Integer> values) {
    return VarianceCalculator.sample(values);
}
public static double stddevPopulation(List<Integer> values) {
    return StdDevCalculator.population(values);
}
public static double stddevSample(List<Integer> values) {
    return StdDevCalculator.sample(values);
}

public static int range(List<Integer> values) {
        if (values == null || values.isEmpty() || values.stream().allMatch(Objects::isNull)) {
            throw new IllegalArgumentException("Input cannot be null or empty.");
        }
        int max = Collections.max(values.stream().filter(Objects::nonNull).collect(Collectors.toList()));
        int min = Collections.min(values.stream().filter(Objects::nonNull).collect(Collectors.toList()));
        return max - min;
    }

    public static double percentile(java.util.List<Integer> values, double p) {
        return QuantilesCalculator.nearestRankPercentile(values, p);
    }

    public static double iqr(java.util.List<Integer> values) {
        return IqrCalculator.compute(values);
    }

}
