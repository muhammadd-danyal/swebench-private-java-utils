package com.example.math;

import java.util.List;
import java.util.stream.Collectors;

final class StatsFormatter {
    private StatsFormatter() {}
    static String listToCsv(List<Integer> values) {
        return values.stream().map(String::valueOf).collect(Collectors.joining(","));
    }
}
