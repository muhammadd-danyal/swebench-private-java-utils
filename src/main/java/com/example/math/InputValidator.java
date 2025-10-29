package com.example.math;

import java.util.ArrayList;
import java.util.List;

final class InputValidator {
    private InputValidator() {}

    static <T> List<T> requireNonNullNonEmptyNonAllNull(List<T> input, String what) {
        if (input == null) throw new StatisticsException(what + " is null");
        if (input.isEmpty()) throw new StatisticsException(what + " is empty");

        List<T> filtered = new ArrayList<>();
        for (T t : input) if (t != null) filtered.add(t);
        if (filtered.isEmpty()) throw new StatisticsException(what + " contains only nulls");
        return filtered;
    }
}
