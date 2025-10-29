package com.example.math;

import java.util.List;

/** Tiny value-object used in integration tests & examples. */
public class DatasetSample {
    private final String name;
    private final List<Integer> values;

    public DatasetSample(String name, List<Integer> values) {
        this.name = name;
        this.values = values;
    }

    public String name()   { return name; }
    public List<Integer> values() { return values; }
}
