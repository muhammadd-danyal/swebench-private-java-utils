package com.example.math;

import java.util.*;

public class MathUtils {

    // Computes the average of integers, ignoring nulls.
    public static double average(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("List is null or empty");
        }

        List<Integer> filtered = new ArrayList<>();
        for (Integer n : numbers) {
            if (n != null) filtered.add(n);
        }

        if (filtered.isEmpty()) {
            throw new IllegalArgumentException("All elements are null");
        }

        double sum = 0.0;
        for (int n : filtered) {
            sum += n;
        }
        return sum / filtered.size();
    }

    // Computes the median, handling both odd and even-sized lists.
    public static double median(List<Integer> values) {
        if (values == null) {
            throw new IllegalArgumentException("List is null");
        }

        List<Integer> filtered = new ArrayList<>();
        for (Integer v : values) {
            if (v != null) filtered.add(v);
        }

        if (filtered.isEmpty()) {
            throw new IllegalArgumentException("List is empty or all nulls");
        }

        Collections.sort(filtered);
        int n = filtered.size();
        int mid = n / 2;

        if (n % 2 == 1) {
            return filtered.get(mid);
        } else {
            return (filtered.get(mid - 1) + filtered.get(mid)) / 2.0;
        }
    }
}
