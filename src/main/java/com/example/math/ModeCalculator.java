package com.example.math;

import java.util.List;
import java.util.Map;

final class ModeCalculator {
    private ModeCalculator() {}

    static int computeMode(List<Integer> input) {
        List<Integer> data = InputValidator.requireNonNullNonEmptyNonAllNull(input, "values");
        Map<Integer,Integer> freq = FrequencyMap.countInts(data);

        int max = 0;
        for (int count : freq.values()) if (count > max) max = count;

        return TieBreaker.smallestAmongMax(freq, max);
    }
}
