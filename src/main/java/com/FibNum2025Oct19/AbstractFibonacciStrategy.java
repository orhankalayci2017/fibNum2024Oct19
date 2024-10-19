package com.FibNum2025Oct19;

public abstract class AbstractFibonacciStrategy implements FibonacciStrategy {

    private static final int MAX_INDEX = 45;

    // Shared validation logic
    public void validateIndex(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Index must be a non-negative integer.");
        }
        if (index > MAX_INDEX) {
            throw new IllegalArgumentException("Index must not exceed " + MAX_INDEX + ".");
        }
    }

    // Method to handle the base cases of Fibonacci (F(0), F(1))
    protected int handleBaseCases(int index) {
        if (index == 0) return 0;
        if (index == 1) return 1;
        return -1; // Indicating that the index isn't a base case (caller should proceed with calculation)
    }
    // Abstract method for the Fibonacci calculation, to be implemented by subclasses
    public abstract int getFibonacciNumber(int index);
}
