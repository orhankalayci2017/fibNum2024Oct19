package com.FibNum2025Oct19;


public class FibonacciNumberGenerator {

    private FibonacciStrategy fibonacciStrategy;

    private static final int MAX_INDEX = 45;

    // Constructor that takes a Fibonacci strategy as an argument
    public FibonacciNumberGenerator(FibonacciStrategy strategy) {
        this.fibonacciStrategy = strategy;
    }

    // Default constructor that assigns the default strategy (Iterative Strategy)
    public FibonacciNumberGenerator() {
        this.fibonacciStrategy = new IterativeFibonacciStrategy(); // Default to iterative strategy
    }

    // Main method that uses the strategy
    public int getFibNum(int index) {
        validateIndex(index);
        return fibonacciStrategy.getFibonacciNumber(index);
    }

    // Validation logic remains separate
    private void validateIndex(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Index must be a non-negative integer.");
        }
        if (index > MAX_INDEX) {
            throw new IllegalArgumentException("Index must not exceed " + MAX_INDEX + ".");
        }
    }
}