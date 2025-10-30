package com.example.math;

import java.util.List;

final class StdDevCalculator {
    private StdDevCalculator() {}

    static double population(List<Integer> input) {
        return Math.sqrt(VarianceCalculator.population(input));
    }

    static double sample(List<Integer> input) {
        return Math.sqrt(VarianceCalculator.sample(input));
    }
}
