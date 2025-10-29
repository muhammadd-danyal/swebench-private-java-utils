package com.example.math;

import java.util.Map;

final class TieBreaker {
    private TieBreaker() {}

    /** Return smallest key among those with the given max frequency. */
    static int smallestAmongMax(Map<Integer,Integer> freq, int max) {
        Integer best = null;
        for (Map.Entry<Integer,Integer> e : freq.entrySet()) {
            if (e.getValue() == max) {
                if (best == null) best = e.getKey();
                else best = Ordering.min(best, e.getKey());
            }
        }
        return best;
    }
}
