package com.example.math;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class FrequencyMap {
    private FrequencyMap() {}

    static Map<Integer,Integer> countInts(List<Integer> vals) {
        Map<Integer,Integer> m = new HashMap<>();
        for (Integer v : vals) {
            m.put(v, m.getOrDefault(v, 0) + 1);
        }
        return m;
    }
}
