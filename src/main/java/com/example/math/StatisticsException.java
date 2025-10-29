package com.example.math;

/** Narrow exception that still counts as IllegalArgumentException. */
public class StatisticsException extends IllegalArgumentException {
    public StatisticsException(String message) { super(message); }
}
